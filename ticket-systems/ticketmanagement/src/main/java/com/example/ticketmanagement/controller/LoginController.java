package com.example.ticketmanagement.controller;

import com.example.ticketdb.bean.User;
import com.example.ticketmanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("userLogin")
    public int userLogin(@RequestBody User user){
        int rst = loginService.toLogin(user);
        return rst;
    }
}
