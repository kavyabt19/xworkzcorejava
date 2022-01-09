package jkzhou.onboarding.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@SpringBootApplication
@EntityScan("jkzhou.onboarding.api")
@PropertySource("classpath:email-address-server.properties")
public class EmailAddressServer
{

    public static void main(String[] args)
    {
        SpringApplication.run(EmailAddressServer.class, args);
    }

}
