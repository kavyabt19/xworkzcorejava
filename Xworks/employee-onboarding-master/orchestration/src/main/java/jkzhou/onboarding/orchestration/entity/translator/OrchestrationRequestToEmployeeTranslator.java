package jkzhou.onboarding.orchestration.entity.translator;

import jkzhou.onboarding.api.Employee;
import jkzhou.onboarding.orchestration.entity.OrchestrationRequest;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-26
 */
public final class OrchestrationRequestToEmployeeTranslator
{

    public static Employee toEmployee(OrchestrationRequest from)
    {
        if (from == null)
        {
            return null;
        }
        Employee to = new Employee();
        to.setFirstName(from.getFirstName());
        to.setLastName(from.getLastName());
        to.setLevel(from.getLevel());
        to.setStartDate(from.getStartDate());
        return to;
    }

    private OrchestrationRequestToEmployeeTranslator()
    {
    }
}
