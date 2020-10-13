package com.example.ticketdeal.controller;

import com.example.ticketdb.bean.User;
import com.example.ticketdeal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 。
 *
 * @author 卢宏政
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/getUserByLoginName")
    public User getUserByLoginName(String loginName){
        return  userService.getUserByLoginName(loginName);
    }

}
