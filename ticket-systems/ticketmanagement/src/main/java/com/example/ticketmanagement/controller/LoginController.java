package com.example.ticketmanagement.controller;

import com.example.ticketdb.bean.Result;
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
    public Result userLogin(@RequestBody User user){
        Result rst = new Result();
        User userdb = loginService.toLogin(user);
        if(userdb!=null){
            rst.setObj(userdb);
        }else{
            rst.setCode(999);
        }
        return rst;
    }
}
