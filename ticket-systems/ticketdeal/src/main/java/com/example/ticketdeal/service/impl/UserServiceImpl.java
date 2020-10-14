package com.example.ticketdeal.service.impl;


import com.example.ticketdb.bean.User;
import com.example.ticketdeal.mapper.UserMapper;
import com.example.ticketdeal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 。
 *
 * @author 卢宏政
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByLoginName(String loginName) {
        User user = userMapper.getUserByLoginName(loginName);
        return user;
    }
}
