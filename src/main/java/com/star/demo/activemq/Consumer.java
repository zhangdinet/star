package com.star.demo.activemq;

import javax.annotation.Resource;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by zhangdi on 2015/8/25.
 */

@Component
public class Consumer {

    @Resource
    private JmsTemplate jmsTemplate;

    public void receive() {
        while (true) {
            try {
                TextMessage textMessage = (TextMessage) jmsTemplate.receive();
                if (textMessage != null) {
                    System.out.println("收到消息内容：" + textMessage.getText());
                } else {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
