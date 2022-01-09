package jkzhou.onboarding.api;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@Entity
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String firstName;

    private String lastName;

    private String startDate;

    private int level;

    public String getFirstName()
    {
        return firstName;
    }

    public UUID getId()
    {
        return id;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getLevel()
    {
        return level;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", startDate=" + startDate
               + ", level=" + level + "]";
    }
}
