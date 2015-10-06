package com.star.demo.ons;

import com.aliyun.openservices.ons.api.*;

import java.util.Properties;

/**
 * Created by zhangdi on 2015/10/6.
 */
public class OnsReceive {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.ConsumerId, "CID_ZHANGDI_C");
        properties.put(PropertyKeyConst.AccessKey, "");
        properties.put(PropertyKeyConst.SecretKey, "");
        Consumer consumer = ONSFactory.createConsumer(properties);
        consumer.subscribe("zhangdinet", "*", new MessageListener() {
            public Action consume(Message message, ConsumeContext context) {
                System.out.println("Receive: " + message);
                return Action.CommitMessage;
            }
        });
        consumer.start();
        System.out.println("Consumer Started");
    }
}
