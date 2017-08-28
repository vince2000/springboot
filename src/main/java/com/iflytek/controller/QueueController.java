package com.iflytek.controller;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iflytek.jms.MSGProduce;

@RestController
@RequestMapping
public class QueueController {

    @Autowired
    MSGProduce msgp;
    
    @RequestMapping(value="queueTest",method=RequestMethod.POST)
    public void testQueue(){
        Destination des = new ActiveMQQueue("lldeng2.test.queue");
        msgp.sendMessage(des, "这是一条测试数据002,类型为queue");
    }
    
    @RequestMapping(value="topicTest",method=RequestMethod.POST)
    public void testTopic(){
        Destination des = new ActiveMQTopic("lldeng2.test.topic");
        msgp.sendMessage(des, "这是一条测试数据002,类型为topic");
    }
}
