package cn.lhzh.cache.controller;

import cn.lhzh.cache.bean.Department;
import cn.lhzh.cache.bean.Employee;
import cn.lhzh.cache.service.DepService;
import cn.lhzh.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class DepController {
    @Autowired
    DepService depService;


    @GetMapping("/getDepById")
    public Department getDepById(Integer id){
        return depService.getDepById(id);
    }

//    @GetMapping("/updateEmployee")
//    public Employee updateEmployee(Employee employee){
//        Employee emp = employeeService.updateEmployee(employee);
//        return emp;
//    }
//
//    @GetMapping("/delEmployee")
//    public String delEmployee(Integer id){
//        String rst = employeeService.delEmployee(id);
//        return rst;
//    }
//
//    @GetMapping("/getEmployeeByLastName")
//    public Employee getEmployeeByLastName(String lastName){
//        return employeeService.getEmployeeByLastName(lastName);
//    }
}
