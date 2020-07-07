package cn.lhzh.springboot04webrestfulcrud.controller;

import cn.lhzh.springboot04webrestfulcrud.entities.Employee;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Author admin
 * @Date 2020/6/1
 */
@Controller
public class LoginController {

//    //List的copy
//    List<Employee> list=new ArrayList<>();
//    Employee e1=new Employee();
//        e1.setId(1);
//        e1.setLastName("11");
//    Employee e2=new Employee();
//        e2.setId(2);
//        e2.setLastName("22");
//    Employee e3=new Employee();
//        e3.setId(3);
//        e3.setLastName("33");
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//
//
//    //第一种:循环遍历复制
//    List<Employee> list1=new ArrayList<>();
//
//        for (Employee e:list){
//        list1.add(e);
//    }
//
//    //第一二种:new ArrayList<>(list);
//    List<Employee> list2=new ArrayList<>(list);
//
//    //第三种:addAll
//    List<Employee> list3=new ArrayList<>();
//        list3.addAll(list);
//
//    //第四种:Collections.copy();
//    List<Employee> list4=new ArrayList<>(Arrays.asList(new Employee[list.size()]));
//        Collections.copy(list4,list);
//
//
//
//
//        list1.get(0).setLastName("11改");
//
//        System.out.println("list1是:"+list1);
//        System.out.println("list2是:"+list2);
//        System.out.println("list3是:"+list3);
//        System.out.println("list4是:"+list4);

//    @ResponseBody
    @RequestMapping("/user/login")
    public String login(@RequestParam("username")String username, @RequestParam("password") String password, Map<String,Object>map, HttpServletRequest request){
        System.out.println(username);
        System.out.println(password);
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            request.getSession().setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else{
            map.put("msg","用户名密码错误");
            return "login";
        }

    }
}
