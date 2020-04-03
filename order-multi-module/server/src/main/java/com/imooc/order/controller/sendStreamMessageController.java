package com.imooc.order.controller;

import com.imooc.order.dto.OrderDTO;
import com.imooc.order.message.StreamReceiverClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author Miracle Luna
 * @Date 2020/4/1 20:53
 * @Version 1.0
 */
@Slf4j
@RestController
public class sendStreamMessageController {

    @Resource
    private  StreamReceiverClient streamReceiverClient;

    @GetMapping("/sendMessageStr")
    public void sendMessage(){
        // 发送字符串消息
        String message = "now " + new Date();
        streamReceiverClient.output().send(MessageBuilder.withPayload(message).build());
    }

    /**
     * 发送对象
     */
    @GetMapping("/sendMessageObject")
    public void process() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("123456");
        streamReceiverClient.output().send(MessageBuilder.withPayload(orderDTO).build());
    }
}
