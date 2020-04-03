package com.imooc.order.message;

import com.imooc.order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @Author Miracle Luna
 * @Date 2020/4/1 20:51
 * @Version 1.0
 */
@Component
@EnableBinding(StreamReceiverClient.class)
@Slf4j
public class StreamReceiver {

    /**
     * 接收字符串消息
     * @param message
     */
    /*@StreamListener(value = StreamReceiverClient.OUTPUT)
    public void processStr(Object message) {
        log.info("Stream接收消息字符串消息 -> {}", message);
    }*/

    /**
     * 接收对象消息
     * @param message
     */
    @StreamListener(value = StreamReceiverClient.INPUT)
    @SendTo(StreamReceiverClient.OUTPUT2)// 返回消息
    public String processObject(OrderDTO message) {
        log.info("Stream接收对象消息 {}", message);
        return "receiver success";
    }

    @StreamListener(value = StreamReceiverClient.OUTPUT2)
    public void process2(String message) {
        log.info("接收后通知: {}", message);
    }
}
