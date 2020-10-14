package com.example.ticketkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 。
 *
 * @author 卢宏政
 */
@RestController
public class TicketKafkaController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("addMsg")
    public void addMsg(){
        kafkaTemplate.send("ticket-buy","nihao");
    }
}
