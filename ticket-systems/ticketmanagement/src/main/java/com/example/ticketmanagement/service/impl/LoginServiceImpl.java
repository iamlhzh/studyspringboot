package com.example.ticketmanagement.service.impl;

import com.example.ticketdb.bean.User;
import com.example.ticketmanagement.feign.TicketDealFeignService;
import com.example.ticketmanagement.service.LoginService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 。
 *
 * @author 卢宏政
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private TicketDealFeignService ticketDealFeignService;

    @Override
    @CachePut(cacheNames = {"user"},key = "#result.id")
    public User toLogin(User user) {
        User userdb= ticketDealFeignService.getUserByLoginName(user);
        return userdb;
    }
}
