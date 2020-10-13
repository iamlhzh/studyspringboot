package com.example.ticketmanagement.controller;

import com.example.ticketmanagement.bean.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping("userLogin")
    public int userLogin(@RequestBody User user){
        return 1;
    }
}
