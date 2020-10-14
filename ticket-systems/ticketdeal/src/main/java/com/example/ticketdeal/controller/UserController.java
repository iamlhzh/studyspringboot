package com.example.ticketdeal.controller;

import com.example.ticketdb.bean.User;
import com.example.ticketdeal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getUserByLoginName")
    public User getUserByLoginName(User user){
        return  userService.getUserByLoginName(user.getLoginName());
    }

}
