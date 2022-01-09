package jkzhou.onboarding.manager;

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
@PropertySource("classpath:manager-assignment-server.properties")
public class ManagerAssignmentServer
{

    public static void main(String[] args)
    {
        SpringApplication.run(ManagerAssignmentServer.class, args);
    }
}
