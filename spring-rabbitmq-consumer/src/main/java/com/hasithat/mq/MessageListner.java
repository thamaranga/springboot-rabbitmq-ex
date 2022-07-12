 package com.hasithat.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListner {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listner(CustomMessage customMessage){
        System.out.println("Message received | "+customMessage);
    }
}
