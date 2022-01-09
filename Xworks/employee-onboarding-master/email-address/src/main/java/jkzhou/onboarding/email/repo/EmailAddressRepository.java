package jkzhou.onboarding.email.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jkzhou.onboarding.api.EmailAddress;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@Repository
public interface EmailAddressRepository extends JpaRepository<EmailAddress, UUID>
{

    EmailAddress findByAddress(String address);

}