package jkzhou.onboarding.orchestration.jms;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@Configuration
@EnableJms
public class JmsConfig
{

    @Bean
    MessageConverter jmsMessageConverter()
    {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("javaType");
        return converter;
    }

    @Bean
    JmsTemplate jmsQueueTemplate(ConnectionFactory connectionFactory, MessageConverter jmsMessageConverter)
    {
        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
        jmsTemplate.setMessageConverter(jmsMessageConverter);
        return jmsTemplate;
    }

    @Bean
    Queue queueEmailIn(@Value("${onboarding.email.queue.in}") String nameOfQueue)
    {
        return new ActiveMQQueue(nameOfQueue);
    }

    @Bean
    Queue queueEmailOut(@Value("${onboarding.email.queue.out}") String nameOfQueue)
    {
        return new ActiveMQQueue(nameOfQueue);
    }

    @Bean
    Queue queueEmployeeIn(@Value("${onboarding.employee.queue.in}") String nameOfQueue)
    {
        return new ActiveMQQueue(nameOfQueue);
    }

    @Bean
    Queue queueEmployeeOut(@Value("${onboarding.employee.queue.out}") String nameOfQueue)
    {
        return new ActiveMQQueue(nameOfQueue);
    }

    @Bean
    Queue queueManagerIn(@Value("${onboarding.manager.queue.in}") String nameOfQueue)
    {
        return new ActiveMQQueue(nameOfQueue);
    }

    @Bean
    Queue queueManagerOut(@Value("${onboarding.manager.queue.out}") String nameOfQueue)
    {
        return new ActiveMQQueue(nameOfQueue);
    }
}

