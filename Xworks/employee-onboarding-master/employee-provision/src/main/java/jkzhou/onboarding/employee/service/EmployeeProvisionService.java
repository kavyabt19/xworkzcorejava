package jkzhou.onboarding.employee.service;

import jkzhou.onboarding.api.Employee;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
public interface EmployeeProvisionService
{

    /**
     * @param employee new employee to be provisioned
     * @return id of the employee
     */
    String submitEmployee(Employee employee);

}
