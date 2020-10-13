package com.example.ticketdeal.service.impl;


import com.example.ticketdb.bean.User;
import com.example.ticketdeal.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 。
 *
 * @author 卢宏政
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserByLoginName(String loginName) {
        User user = new User();
        user.setId(18);
        user.setLoginName(loginName);
        return user;
    }
}
