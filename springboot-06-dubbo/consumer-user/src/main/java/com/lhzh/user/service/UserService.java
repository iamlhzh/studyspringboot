package com.lhzh.user.service;

import com.lhzh.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @DubboReference
    TicketService ticketService;

    public void hello() {
        String ticket = ticketService.getTicket();
        System.out.println("票来了："+ticket);
    }

}
