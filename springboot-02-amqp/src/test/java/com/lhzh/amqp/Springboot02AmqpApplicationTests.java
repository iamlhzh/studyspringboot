package com.lhzh.amqp;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Springboot02AmqpApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    void createExchange() {
//        amqpAdmin.declareExchange(new FanoutExchange("newFanout"));
//        amqpAdmin.declareQueue(new Queue("newQueue"));
        amqpAdmin.declareBinding(new Binding("newQueue", Binding.DestinationType.QUEUE,"newFanout","routKey",null));
    }

    @Test
    void contextLoads() {
        Map<String,String> obj=new HashMap<>();
        obj.put("nihao","haode");
        rabbitTemplate.convertAndSend("lhzh","hello",obj);
    }

    @Test
    public void receive(){
        Object o = rabbitTemplate.receiveAndConvert("lhzh_queue");
        System.out.println(o);
    }

}
