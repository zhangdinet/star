package com.star.demo.activemq;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.star.demo.activemq.Consumer;
import com.star.demo.activemq.Producer;


/**
 * Created by zhangdi on 2015/8/25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class, TransactionalTestExecutionListener.class})
@ContextConfiguration(locations = {
        "classpath:/applicationContext.xml",
        "classpath*:spring-jms.xml"})
public class JMSTest {

    @Resource
    private Producer producer;

    @Resource
    private Consumer consumer;

    @Test
    public void testJMS() {
        producer.send();
        consumer.receive();
    }
}
