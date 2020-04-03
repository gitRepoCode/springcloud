package com.imooc.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author Miracle Luna
 * @Date 2020/4/1 20:49
 * @Version 1.0
 */
public interface StreamReceiverClient {
    String INPUT = "myInputMessage";
    String OUTPUT = "myOutputMessage";

    String INPUT2 = "myInputMessage2";
    String OUTPUT2 = "myOutputMessage2";

    @Input(StreamReceiverClient.INPUT)
    SubscribableChannel input();

    @Output(StreamReceiverClient.OUTPUT)
    MessageChannel output();

    @Input(StreamReceiverClient.INPUT2)
    SubscribableChannel input2();

    @Output(StreamReceiverClient.OUTPUT2)
    MessageChannel output2();

}
