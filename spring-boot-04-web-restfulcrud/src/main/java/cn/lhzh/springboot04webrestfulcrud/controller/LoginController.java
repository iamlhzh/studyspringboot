package cn.lhzh.springboot04webrestfulcrud.controller;

import cn.lhzh.springboot04webrestfulcrud.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author admin
 * @Date 2020/6/1
 */
@Controller
public class LoginController {

    @ResponseBody
    @RequestMapping("/user/login")
    public String login(String username,String password){
        System.out.println(username);
        System.out.println(password);
        //List的copy
        List<Employee> list1=new ArrayList<>();
        Employee e1=new Employee();
        e1.setId(1);
        e1.setLastName("11");
        Employee e2=new Employee();
        e2.setId(2);
        e2.setLastName("22");
        Employee e3=new Employee();
        e3.setId(3);
        e3.setLastName("33");
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);

        List<Employee> list2=new ArrayList<>(list1);
        list1.get(0).setLastName("11改");

        System.out.println("list1是:"+list1);
        System.out.println("list2是:"+list2);

        return "dashboard";
    }
}
