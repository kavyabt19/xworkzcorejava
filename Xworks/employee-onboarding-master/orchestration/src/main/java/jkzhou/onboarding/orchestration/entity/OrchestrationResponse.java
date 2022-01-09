package jkzhou.onboarding.orchestration.entity;

import java.io.Serializable;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-26
 */
public class OrchestrationResponse implements Serializable
{

    private static final long serialVersionUID = -7224055101912337901L;

    private final String correlationId;

    private volatile String userId;

    private volatile String emailAddress;

    private transient volatile boolean completed;

    /**
     * @param correlationId relates the response with the request
     */
    public OrchestrationResponse(String correlationId)
    {
        this.correlationId = correlationId;
    }

    public String getCorrelationId()
    {
        return correlationId;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getUserId()
    {
        return userId;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    @Override
    public String toString()
    {
        return "OrchestrationRestResponse [correlationId=" + correlationId + ", userId=" + userId + ", emailAddress="
               + emailAddress + "]";
    }
}
