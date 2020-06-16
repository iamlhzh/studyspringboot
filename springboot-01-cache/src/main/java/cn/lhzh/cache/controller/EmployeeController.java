package cn.lhzh.cache.controller;

import cn.lhzh.cache.bean.Employee;
import cn.lhzh.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public Employee getEmployeeById(Integer id){
        return employeeService.getEmployeeById(id);
    }
}
