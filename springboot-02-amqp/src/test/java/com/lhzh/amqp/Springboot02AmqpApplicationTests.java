package com.lhzh.amqp;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Springboot02AmqpApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

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
