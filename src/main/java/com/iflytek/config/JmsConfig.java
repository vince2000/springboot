package com.iflytek.config;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

@Configuration  
@EnableJms  //实现queue和topic
public class JmsConfig {
    
    @Bean  
    public JmsListenerContainerFactory<?> topicListenerFactory(ConnectionFactory connectionFactory) {  
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();  
        factory.setPubSubDomain(true);  //关键
        factory.setConnectionFactory(connectionFactory);  
        return factory;  
    }  
  
    @Bean
    public JmsListenerContainerFactory<?> queueListenerFactory(ConnectionFactory connectionFactory) {  
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();  
        factory.setPubSubDomain(false);  
        factory.setConnectionFactory(connectionFactory);  
        return factory;  
    }  
}
