package jkzhou.onboarding.orchestration.service;

import javax.jms.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessagePostProcessor;
import org.springframework.stereotype.Service;

import jkzhou.onboarding.api.Employee;
import jkzhou.onboarding.api.ManagerAssignment;
import jkzhou.onboarding.api.ServiceResponse;
import jkzhou.onboarding.orchestration.entity.OrchestrationRequest;
import jkzhou.onboarding.orchestration.entity.OrchestrationResponse;
import jkzhou.onboarding.orchestration.entity.translator.OrchestrationRequestToEmployeeTranslator;
import jkzhou.onboarding.utils.MessagingUtils;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-26
 */
@Service
public class OrchestrationService
{
    private static final Logger LOG = LoggerFactory.getLogger(OrchestrationService.class);

    @Autowired
    private JmsTemplate jmsQueueTemplate;

    @Autowired
    private Queue queueEmployeeIn;

    @Autowired
    private Queue queueEmailIn;

    @Autowired
    private Queue queueManagerIn;

    @Autowired
    private Queue queueEmployeeOut;

    @Autowired
    private Queue queueEmailOut;

    @Autowired
    private Queue queueManagerOut;

    public OrchestrationResponse initiateEmployeeRegistration(String correlationId, OrchestrationRequest request)
    {
        LOG.info("Initiating employee registration process for request: {}", request);

        final OrchestrationResponse response = new OrchestrationResponse(correlationId);
        final String filterByCorrelationId = "JMSCorrelationID = '" + correlationId + "'";

        Employee employee = OrchestrationRequestToEmployeeTranslator.toEmployee(request);
        jmsQueueTemplate.convertAndSend(queueEmployeeIn, MessagingUtils.request(employee), getMessagePostProcessor(correlationId));
        String employeeId = receiveResponse(queueEmployeeOut, filterByCorrelationId, String.class);
        LOG.info("Employee ID is configured: correlationId={}, employeeId={}", correlationId, employeeId);

        jmsQueueTemplate.convertAndSend(queueEmailIn, MessagingUtils.request(employeeId), getMessagePostProcessor(correlationId));
        String emailAddress = receiveResponse(queueEmailOut, filterByCorrelationId, String.class);
        LOG.info("Email address is configured: correlationId={}, emailAddress={}", correlationId, emailAddress);

        if (request.getManagerUserId() != null)
        {
            jmsQueueTemplate.convertAndSend(queueManagerIn, MessagingUtils.request(new ManagerAssignment(employeeId, request.getManagerUserId())),
                                            getMessagePostProcessor(correlationId));
            boolean success = receiveResponse(queueManagerOut, filterByCorrelationId, Boolean.class);
            LOG.info("Manager assignment is finished: correlationId={}, success={}", correlationId, success);
        }

        response.setUserId(employeeId);
        response.setEmailAddress(emailAddress);
        return response;
    }

    private MessagePostProcessor getMessagePostProcessor(final String correlationId)
    {
        return message ->
        {
            message.setJMSCorrelationID(correlationId);
            message.setJMSTimestamp(System.nanoTime());
            return message;
        };
    }

    private <T> T receiveResponse(Queue responseQueue, String filter, Class<T> responseType)
    {
        @SuppressWarnings("unchecked")
        ServiceResponse<T> response = (ServiceResponse<T>) jmsQueueTemplate.receiveSelectedAndConvert(responseQueue, filter);
        if (response.getError() != null)
        {
            String error = response.getError();
            LOG.error("Received error from queue[{}]: {}", responseQueue, error);
            // FIXME should use a more accurate exception type
            throw new RuntimeException(error);
        }
        return MessagingUtils.resolveResponse(response, responseType).getPayload();
    }
}
