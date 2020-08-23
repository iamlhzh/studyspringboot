package com.lhzh.springboot.data.mybatis.controller;

import com.lhzh.springboot.data.mybatis.bean.DepartMent;
import com.lhzh.springboot.data.mybatis.bean.Employee;
import com.lhzh.springboot.data.mybatis.mapper.EmployeeMapper;
import com.lhzh.springboot.data.mybatis.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/getDept/{id}")
    public DepartMent getDeptById(@PathVariable Integer id){
       return  testMapper.getDeptById(id);
    }
    @GetMapping("/getEmp/{id}")
    public Employee getEmp(@PathVariable Integer id){
        return  employeeMapper.getEmpById(id);
    }
}
