package jkzhou.onboarding.manager.service;

import jkzhou.onboarding.api.ManagerAssignment;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
public interface ManagerAssignmentService
{

    /**
     * @param assignment which specifies the id of manager and the id of new
     *                   employee
     * @return
     */
    boolean assignManager(ManagerAssignment assignment);
}
