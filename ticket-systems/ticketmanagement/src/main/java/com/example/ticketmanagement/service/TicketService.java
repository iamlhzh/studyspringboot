package com.example.ticketmanagement.service;


import com.example.ticketdb.bean.Result;
import com.example.ticketdb.bean.User;
import com.example.ticketdb.bean.UserTicket;

/**
 * 。
 *
 * @author 卢宏政
 */
public interface TicketService {

    Result buyTicket(UserTicket userTicket);
}
