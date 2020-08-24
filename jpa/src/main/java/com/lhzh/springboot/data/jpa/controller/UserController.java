package com.lhzh.springboot.data.jpa.controller;

import com.lhzh.springboot.data.jpa.entity.User;
import com.lhzh.springboot.data.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Integer id){
//        Optional<User> optionalUser1 = userRepository.findById(id);
        User one = userRepository.getOne(id);
        return one;
    }

    @GetMapping("/user")
    public User inserUser(User user){
        User save = userRepository.save(user);
        return save;
    }


}
