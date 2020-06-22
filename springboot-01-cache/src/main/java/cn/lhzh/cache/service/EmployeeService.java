package cn.lhzh.cache.service;

import cn.lhzh.cache.bean.Employee;

public interface EmployeeService {


    public Employee getEmployeeById(Integer id);

    public Employee updateEmployee(Employee employee);

    String delEmployee(Integer id);

    Employee getEmployeeByLastName(String lastName);
}
