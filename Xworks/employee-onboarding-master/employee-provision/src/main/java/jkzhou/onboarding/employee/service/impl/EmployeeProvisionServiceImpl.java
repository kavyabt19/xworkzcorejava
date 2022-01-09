package jkzhou.onboarding.employee.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jkzhou.onboarding.api.Employee;
import jkzhou.onboarding.employee.repo.EmployeeRepository;
import jkzhou.onboarding.employee.service.EmployeeProvisionService;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@Service
public class EmployeeProvisionServiceImpl implements EmployeeProvisionService
{
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeProvisionServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public String submitEmployee(Employee newEmployee)
    {
        LOG.info("Submitting new employee: {}", newEmployee);
        Employee savedEmployee = employeeRepo.save(newEmployee);
        LOG.info("Employee saved to database: {}", savedEmployee);
        return String.valueOf(savedEmployee.getId());
    }

}
