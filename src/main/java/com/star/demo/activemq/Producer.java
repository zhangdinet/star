package com.star.demo.activemq;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * Created by zhangdi on 2015/8/25.
 */

@Component
public class Producer {

    @Resource
    private JmsTemplate jmsTemplate;

    public void send() {
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("Just a demo!");
            }
        });
    }

}
