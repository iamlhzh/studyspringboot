package cn.lhzh.springboot04webrestfulcrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author admin
 * @Date 2020/6/1
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World!";
    }
}
