package com.example.ticketmanagement.controller;

import com.example.ticketdb.bean.Result;
import com.example.ticketdb.bean.User;
import com.example.ticketdb.bean.UserTicket;
import com.example.ticketmanagement.service.LoginService;
import com.example.ticketmanagement.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("buyTicket")
    public Result buyTicket(@RequestBody UserTicket userTicket){
        Result rst  = ticketService.buyTicket(userTicket);
        return rst;
    }
}
