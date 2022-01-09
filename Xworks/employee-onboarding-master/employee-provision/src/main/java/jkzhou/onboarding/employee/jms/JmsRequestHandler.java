package jkzhou.onboarding.employee.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.JmsHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import jkzhou.onboarding.api.Employee;
import jkzhou.onboarding.api.ServiceRequest;
import jkzhou.onboarding.api.ServiceResponse;
import jkzhou.onboarding.employee.service.EmployeeProvisionService;
import jkzhou.onboarding.utils.MessagingUtils;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@Component
public class JmsRequestHandler
{

    private static final Logger LOG = LoggerFactory.getLogger(JmsRequestHandler.class);

    @Autowired
    private EmployeeProvisionService employeeProvisionService;

    @JmsListener(destination = "${onboarding.employee.queue.in}")
    @SendTo("${onboarding.employee.queue.out}")
    public ServiceResponse<?> handleEmployeeProvisionRequest(@Header(JmsHeaders.CORRELATION_ID) String correlationId,
                                                             @Payload ServiceRequest<Employee> request)
    {
        LOG.info("Received employee provision request: correlationId={}, request={}", correlationId, request);
        try
        {
            MessagingUtils.resolveRequest(request, Employee.class);
            return MessagingUtils.response(employeeProvisionService.submitEmployee(request.getPayload()));
        }
        catch (Exception e)
        {
            LOG.error("Operation failed: {}", e.getMessage());
            return MessagingUtils.errorResponse(e.getMessage());
        }
    }
}
