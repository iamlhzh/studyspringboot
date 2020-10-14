package com.example.ticketkafka.runner;

import com.example.ticketdb.bean.UserTicket;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 。
 *
 * @author 卢宏政
 */
@Component
public class TicketConsumerRunner {


    @KafkaListener(topics = {"ticket-buy"},concurrency = "3")
    public void ticketMessageProcessor(String userTicket){
        System.out.println(Thread.currentThread().getName()+":::"+userTicket);
    }

}
