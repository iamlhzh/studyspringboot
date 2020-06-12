package com.example.demo.controller;

import com.example.demo.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author admin
 * @Date 2020/6/11
 */
@RestController
@RequestMapping("api")
public class HelloController {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private HelloService helloService;

    @RequestMapping("/test")
    public Object test(String id){
        String value=helloService.getValue(id);
        return value;
    }

}
