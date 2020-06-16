package cn.lhzh.cache;

import cn.lhzh.cache.bean.Employee;
import cn.lhzh.cache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01CacheApplicationTests {
	@Autowired
	EmployeeMapper employeeMapper;
	@Test
	void contextLoads() {
		Employee employeeById = employeeMapper.getEmployeeById(1);
		System.out.println(employeeById.getLastName());
	}

}
