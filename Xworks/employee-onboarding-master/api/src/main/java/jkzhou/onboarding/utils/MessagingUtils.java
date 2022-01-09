package jkzhou.onboarding.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import jkzhou.onboarding.api.ServiceRequest;
import jkzhou.onboarding.api.ServiceResponse;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
public final class MessagingUtils
{
    public static ServiceResponse<String> errorResponse(String error)
    {
        ServiceResponse<String> response = new ServiceResponse<>();
        response.setError(error);
        return response;
    }

    public static <T> ServiceRequest<T> request(T payload)
    {
        return new ServiceRequest<>(payload);
    }

    public static <T> ServiceRequest<T> resolveRequest(ServiceRequest<T> request, Class<T> type)
    {
        request.setPayload(resolve(request.getPayload(), type));
        return request;
    }

    public static <T> ServiceResponse<T> resolveResponse(ServiceResponse<T> response, Class<T> type)
    {
        response.setPayload(resolve(response.getPayload(), type));
        return response;
    }

    public static <T> ServiceResponse<T> response(T payload)
    {
        return new ServiceResponse<>(payload);
    }

    private static <T> T resolve(Object rawPayload, Class<T> type)
    {
        if (!type.isInstance(rawPayload))
        {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.convertValue(rawPayload, type);
        }
        return type.cast(rawPayload);
    }

    private MessagingUtils()
    {
    }

}
