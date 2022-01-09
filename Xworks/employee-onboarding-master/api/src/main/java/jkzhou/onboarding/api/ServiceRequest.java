package jkzhou.onboarding.api;


public class ServiceRequest<T>
{
    private T payload;

    public ServiceRequest()
    {
    }

    public ServiceRequest(T payload)
    {
        this.payload = payload;
    }

    public T getPayload()
    {
        return payload;
    }

    public void setPayload(T payload)
    {
        this.payload = payload;
    }

    @Override
    public String toString()
    {
        return "ServiceRequest [payload=" + payload + "]";
    }
}
