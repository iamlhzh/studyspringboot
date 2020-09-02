package cn.lhzh.cache.mapper;

import cn.lhzh.cache.bean.Department;
import cn.lhzh.cache.bean.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM department WHERE id= #{id}")
    public Department getDepById(Integer id);

    @Update("UPDATE department SET departmentName=#{departmentName} WHERE id=#{id}")
    public void updateDep(Department department);

    @Insert("INSERT INTO department(departmentName) VALUES (#{departmentName}")
    public void insertDep(Department department);
}
