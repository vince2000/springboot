package com.iflytek.jms;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MSGRecive {
    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息  
    @JmsListener(destination = "lldeng2.test.queue",containerFactory="queueListenerFactory")  
    public void receiveQueue(TextMessage text) throws JMSException {  
        System.out.println("Consumer收到的报文为:"+text.getText()+"，是queue类型的");  
    }
    
    @JmsListener(destination = "lldeng2.test.topic",containerFactory="topicListenerFactory")  
    public void receiveTopic(TextMessage text) throws JMSException {  
        System.out.println("Consumer收到的报文为:"+text.getText()+",是topic类型的");  
    }
}
