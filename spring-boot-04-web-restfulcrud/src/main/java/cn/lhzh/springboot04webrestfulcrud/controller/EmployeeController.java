package cn.lhzh.springboot04webrestfulcrud.controller;

import cn.lhzh.springboot04webrestfulcrud.dao.DepartmentDao;
import cn.lhzh.springboot04webrestfulcrud.dao.EmployeeDao;
import cn.lhzh.springboot04webrestfulcrud.entities.Department;
import cn.lhzh.springboot04webrestfulcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {
    
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;
    //获取员工列表
    @GetMapping("/emps")
    public  String list(Model model){
        //thymeleaf默认拼串
        //classpath:/templates/ xxx.html
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps",all);
        return "emp/list";
    }

    @GetMapping("/emp")
    public  String toAddEmpPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public  String addEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public  String toUpdateEmpPage(@PathVariable Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PutMapping("/emp")
    public  String updateEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public  String toUpdateEmpPage(@PathVariable Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
