package com.lhzh.springboot.data.mybatis.mapper;

import com.lhzh.springboot.data.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

    Employee getEmpById(Integer id);
}
