package cn.lhzh.cache.service;

import cn.lhzh.cache.bean.Employee;
import cn.lhzh.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {


    public Employee getEmployeeById(Integer id);
}
