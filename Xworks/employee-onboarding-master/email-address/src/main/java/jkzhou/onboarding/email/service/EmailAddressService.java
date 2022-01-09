package jkzhou.onboarding.email.service;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
public interface EmailAddressService
{

    /**
     * @param userId of the employee
     * @return an unique email address
     */
    String createEmailAddress(String userId);

}
