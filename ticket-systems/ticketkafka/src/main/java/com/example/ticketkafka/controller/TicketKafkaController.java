package com.example.ticketkafka.controller;

import com.alibaba.fastjson.JSON;
import com.example.ticketdb.bean.UserTicket;
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

    @PostMapping("addMsg")
    public void addMsg(@RequestBody UserTicket userTicket){
        for(int i=0;i<100;i++){
            userTicket.setId(i);
            kafkaTemplate.send("ticket-buy", JSON.toJSONString(userTicket));
        }

    }
}
