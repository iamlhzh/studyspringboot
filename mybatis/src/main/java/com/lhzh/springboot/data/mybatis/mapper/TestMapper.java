package com.lhzh.springboot.data.mybatis.mapper;

import com.lhzh.springboot.data.mybatis.bean.DepartMent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface TestMapper {

    @Select("select * from department where id = #{id}")
    DepartMent getDeptById(Integer id);

    @Insert("insert into department (departmentName) values (#{departmentName})")
    int insertDept(DepartMent departMent);

}
