package com.lhzh.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("buy")
    public String buyTicket(){
        String ticket=restTemplate.getForObject("http://PROVIDER-TICKET/getTicket",String.class);
        return "张三买到了"+ticket;
    }
}
