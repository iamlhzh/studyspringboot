package com.lhzh.user;

import com.lhzh.user.service.UserService;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerUserApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
		userService.hello();
	}

}
