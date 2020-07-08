package cn.lhzh.springboot04webrestfulcrud.controller;

import cn.lhzh.springboot04webrestfulcrud.dao.EmployeeDao;
import cn.lhzh.springboot04webrestfulcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    //获取员工列表
    @GetMapping("/emps")
    public  String list(Model model){
        //thymeleaf默认拼串
        //classpath:/templates/ xxx.html
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps",all);
        return "emp/list";
    }
}
