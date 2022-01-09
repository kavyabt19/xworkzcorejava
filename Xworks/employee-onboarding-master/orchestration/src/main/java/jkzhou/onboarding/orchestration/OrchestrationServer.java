package jkzhou.onboarding.orchestration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@PropertySource("classpath:orchestration-server.properties")
public class OrchestrationServer
{

    public static void main(String[] args)
    {
        SpringApplication.run(OrchestrationServer.class, args);
    }
}
