package cn.lhzh.cache.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.lhzh.cache.bean.Employee;
import cn.lhzh.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping("/getEmployeeById")
    public Employee getEmployeeById(Integer id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/updateEmployee")
    public Employee updateEmployee(Employee employee){
        Employee emp = employeeService.updateEmployee(employee);
        return emp;
    }

    @GetMapping("/delEmployee")
    public String delEmployee(Integer id){
        String rst = employeeService.delEmployee(id);
        return rst;
    }

    @GetMapping("/getEmployeeByLastName")
    public Employee getEmployeeByLastName(String lastName){
        return employeeService.getEmployeeByLastName(lastName);
    }
}
