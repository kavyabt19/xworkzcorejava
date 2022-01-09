package jkzhou.onboarding.api;


public class ServiceResponse<T>
{
    private T payload;
    private String error;

    public ServiceResponse()
    {
    }

    public ServiceResponse(T payload)
    {
        this.payload = payload;
    }

    public String getError()
    {
        return error;
    }

    public T getPayload()
    {
        return payload;
    }

    public void setError(String error)
    {
        this.error = error;
    }

    public void setPayload(T payload)
    {
        this.payload = payload;
    }

    @Override
    public String toString()
    {
        return "ServiceResponse [payload=" + payload + ", error=" + error + "]";
    }
}
