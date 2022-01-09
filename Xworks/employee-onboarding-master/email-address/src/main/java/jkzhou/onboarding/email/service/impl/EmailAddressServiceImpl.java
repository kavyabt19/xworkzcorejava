package jkzhou.onboarding.email.service.impl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jkzhou.onboarding.api.EmailAddress;
import jkzhou.onboarding.api.Employee;
import jkzhou.onboarding.email.repo.EmailAddressRepository;
import jkzhou.onboarding.email.service.EmailAddressService;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@Service
public class EmailAddressServiceImpl implements EmailAddressService
{

    private static final Logger LOG = LoggerFactory.getLogger(EmailAddressServiceImpl.class);

    private final RestTemplate restTemplate;

    @Value("${onboarding.employee.rest.endpoint}")
    private String employeeRestEndpoint;

    @Autowired
    private EmailAddressRepository emailAddressRepo;

    public EmailAddressServiceImpl(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public String createEmailAddress(String employeeId)
    {
        LOG.debug("Obtaining employee data with ID: {}", employeeId);
        Employee employee = restTemplate.getForObject(employeeRestEndpoint + "/{employeeId}", Employee.class, employeeId);
        LOG.debug("Retrieved: {}", employee);

        String addressText = generateEmailAddress(employee);
        if (emailAddressRepo.findByAddress(addressText) != null)
        {
            LOG.error("{} already exist, ignoring the request", addressText);
            throw new IllegalArgumentException("Email address assignment failed due to address conflict");
        }

        EmailAddress emailAddress = new EmailAddress(UUID.fromString(employeeId), addressText);
        emailAddressRepo.save(emailAddress);
        LOG.info("Email address created: {}", emailAddress);

        return emailAddress.getAddress();
    }

    private String generateEmailAddress(Employee employee)
    {
        return employee.getFirstName() + "." + employee.getLastName() + "@avanade.com";
    }
}
