package jkzhou.onboarding.employee;

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
@PropertySource("classpath:employee-provision-server.properties")
public class EmployeeProvisionServer
{

    public static void main(String[] args)
    {
        SpringApplication.run(EmployeeProvisionServer.class, args);
    }

}
