package com.lhzh.amqp.controller;

import com.lhzh.amqp.bean.Dog;
import com.lhzh.amqp.bean.MqMsg;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class rabbitmqController {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping("toAddMqMsg")
    public String toAddMqMsg(@RequestBody MqMsg mqMsg){
        rabbitTemplate.convertAndSend(mqMsg.getExchangeName(),mqMsg.getRoutingKey(),mqMsg.getDog());
        return "success";
    }

    @RabbitListener(queues = "lhzh_queue_1")
    public void receiveMsg1( Dog dog){
        System.out.println("收到消息1："+dog);
    }

    @RabbitListener(queues = "lhzh_queue_2")
    public void receiveMsg2( Dog dog){
        System.out.println("收到消息2："+dog);
    }

    @RabbitListener(queues = "lhzh_queue_3")
    public void receiveMsg3( Dog dog){
        System.out.println("收到消息3："+dog);
    }

    @RabbitListener(queues = "lhzh_queue_4")
    public void receiveMsg4( Dog dog){
        System.out.println("收到消息4："+dog);
    }

    @RabbitListener(queues = "lhzh_queue_5")
    public void receiveMsg5( Dog dog){
        System.out.println("收到消息5："+dog);
    }

    @RabbitListener(queues = "lhzh_queue_6")
    public void receiveMsg6( Dog dog){
        System.out.println("收到消息6："+dog);
    }

    @RabbitListener(queues = "lhzh_queue_7")
    public void receiveMsg7 ( Dog dog){
        System.out.println("收到消息7："+dog);
    }

    @RabbitListener(queues = "lhzh_queue_8")
    public void receiveMsg8( Dog dog){
        System.out.println("收到消息8："+dog);
    }

}
