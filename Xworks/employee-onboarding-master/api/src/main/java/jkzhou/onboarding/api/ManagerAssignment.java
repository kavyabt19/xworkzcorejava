package jkzhou.onboarding.api;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ManagerAssignment
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;

    private UUID managerUserId;

    public ManagerAssignment()
    {
    }

    /**
     * @param userId
     * @param managerUserId
     */
    public ManagerAssignment(String userId, String managerUserId)
    {
        this.userId = UUID.fromString(userId);
        this.managerUserId = UUID.fromString(managerUserId);
    }

    public UUID getManagerUserId()
    {
        return managerUserId;
    }

    public UUID getUserId()
    {
        return userId;
    }

    public void setManagerUserId(UUID managerUserId)
    {
        this.managerUserId = managerUserId;
    }

    public void setUserId(UUID userId)
    {
        this.userId = userId;
    }

}
