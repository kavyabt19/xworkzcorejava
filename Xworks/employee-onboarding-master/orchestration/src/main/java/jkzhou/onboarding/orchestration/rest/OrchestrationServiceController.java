package jkzhou.onboarding.orchestration.rest;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jkzhou.onboarding.orchestration.entity.OrchestrationRequest;
import jkzhou.onboarding.orchestration.entity.OrchestrationResponse;
import jkzhou.onboarding.orchestration.service.OrchestrationService;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-26
 */
@RestController
@RequestMapping("/orchestration")
public class OrchestrationServiceController
{

    private static final Logger LOG = LoggerFactory.getLogger(OrchestrationServiceController.class);

    @Autowired
    private OrchestrationService orchestrationService;

    @PostMapping("/employee")
    public OrchestrationResponse registerEmployee(@RequestBody OrchestrationRequest request)
    {
        LOG.info("Received request: payload={}", request);

        String correlationId = UUID.randomUUID().toString();
        OrchestrationResponse response = orchestrationService.initiateEmployeeRegistration(correlationId, request);

        LOG.info("Returning response: payload={}", response);
        return response;
    }

}
