package com.lhzh.providerticket.controller;

import com.lhzh.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("getTicket")
    public String getTicket(){
       return ticketService.getTicket();
    }
}
