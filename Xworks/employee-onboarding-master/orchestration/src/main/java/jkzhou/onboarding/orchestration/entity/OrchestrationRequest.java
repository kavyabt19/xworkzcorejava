package jkzhou.onboarding.orchestration.entity;

import java.io.Serializable;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-26
 */
public class OrchestrationRequest implements Serializable
{
    private static final long serialVersionUID = 5275066665080690286L;

    private String firstName;

    private String lastName;

    private String startDate;

    private int level;

    private String managerUserId;

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getLevel()
    {
        return level;
    }

    public String getManagerUserId()
    {
        return managerUserId;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public void setManagerUserId(String managerUserId)
    {
        this.managerUserId = managerUserId;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    @Override
    public String toString()
    {
        return "OrchestrationRestRequest [firstName=" + firstName + ", lastName=" + lastName + ", startDate="
               + startDate + ", level=" + level + ", managerUserId=" + managerUserId + "]";
    }
}
