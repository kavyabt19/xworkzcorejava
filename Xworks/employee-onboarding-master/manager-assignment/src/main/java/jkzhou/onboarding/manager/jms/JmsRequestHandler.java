package jkzhou.onboarding.manager.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.JmsHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import jkzhou.onboarding.api.ManagerAssignment;
import jkzhou.onboarding.api.ServiceRequest;
import jkzhou.onboarding.api.ServiceResponse;
import jkzhou.onboarding.manager.service.ManagerAssignmentService;
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
    private ManagerAssignmentService managerAssignmentService;

    @JmsListener(destination = "${onboarding.manager.queue.in}")
    @SendTo("${onboarding.manager.queue.out}")
    public ServiceResponse<?> handleManagerAssignmentRequest(@Header(JmsHeaders.CORRELATION_ID) String correlationId,
                                                             @Payload ServiceRequest<ManagerAssignment> request)
    {
        LOG.info("Received manager assignment request: correlationId={}, request={}", correlationId, request);
        try
        {
            MessagingUtils.resolveRequest(request, ManagerAssignment.class);
            return MessagingUtils.response(managerAssignmentService.assignManager(request.getPayload()));
        }
        catch (Exception e)
        {
            LOG.error("Operation failed: {}", e.getMessage());
            return MessagingUtils.errorResponse(e.getMessage());
        }
    }
}
