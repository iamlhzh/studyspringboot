package com.example.ticketmanagement.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.ticketdb.bean.Result;
import com.example.ticketdb.bean.User;
import com.example.ticketdb.bean.UserTicket;
import com.example.ticketmanagement.feign.TicketDealFeignService;
import com.example.ticketmanagement.service.LoginService;
import com.example.ticketmanagement.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.cache.annotation.CachePut;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.client.RestTemplate;

/**
 * 。
 *
 * @author 卢宏政
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private KafkaTemplate kafkaTemplate;


    @Override
    public Result buyTicket(UserTicket userTicket) {
        kafkaTemplate.send("ticket-buy", JSON.toJSONString(userTicket));
        return null;
    }
}
