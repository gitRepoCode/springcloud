package com.imooc.order.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Author Miracle Luna
 * @Date 2020/4/1 20:07
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MqSenderTest {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void mqSender(){
        amqpTemplate.convertAndSend("myQueue", "MQSender发送消息时间：" + new Date());
    }

    @Test
    public void sendOrder() {
        amqpTemplate.convertAndSend("myOrder", "fruit", "now " + new Date());
    }
}