package cn.lhzh.cache;

import cn.lhzh.cache.bean.Employee;
import cn.lhzh.cache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class Springboot01CacheApplicationTests {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
    RedisTemplate redisTemplate;
	@Autowired
    StringRedisTemplate stringRedisTemplate;

	@Autowired
	RedisTemplate<Object, Employee> empRedisTemplate;
	@Test
	public void test01(){
		redisTemplate.opsForValue().append("a","b");
        Employee employeeById = employeeMapper.getEmployeeById(1);
		empRedisTemplate.opsForValue().set("emp-01",employeeById);
        System.out.println(employeeById.getLastName());
	}
	@Test
	void contextLoads() {
		Employee employeeById = employeeMapper.getEmployeeById(1);
        redisTemplate.opsForValue().set("emp-01",employeeById);
		System.out.println(employeeById.getLastName());
	}

}
