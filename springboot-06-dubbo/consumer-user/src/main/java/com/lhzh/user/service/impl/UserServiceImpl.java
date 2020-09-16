//package com.lhzh.user.service.impl;
//
//import com.lhzh.ticket.service.TicketService;
//import com.lhzh.user.service.UserService;
//import org.apache.dubbo.config.annotation.DubboReference;
//
//public class UserServiceImpl implements UserService {
//
//    @DubboReference
//    TicketService ticketService;
//
//    @Override
//    public void hello() {
//        String ticket = ticketService.getTicket();
//        System.out.println("票来了："+ticket);
//    }
//}
