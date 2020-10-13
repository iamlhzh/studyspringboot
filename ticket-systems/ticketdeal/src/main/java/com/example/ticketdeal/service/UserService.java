package com.example.ticketdeal.service;


import com.example.ticketdb.bean.User;

public interface UserService {

    User getUserByLoginName(String loginName);
}
