package com.lhzh.providerticket.service.impl;

import com.lhzh.providerticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "8003-《我的天啊》";
    }
}
