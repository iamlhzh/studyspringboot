package cn.lhzh.cache.service.impl;

import cn.lhzh.cache.bean.Employee;
import cn.lhzh.cache.mapper.EmployeeMapper;
import cn.lhzh.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeMapper.getEmployeeById(id);
    }
}
