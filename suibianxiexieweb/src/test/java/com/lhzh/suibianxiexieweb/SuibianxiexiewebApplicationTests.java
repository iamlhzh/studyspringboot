package com.lhzh.suibianxiexieweb;

import com.lhzh.suibianxiexieweb.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SuibianxiexiewebApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
//		Student bean = (Student) applicationContext.getBean("student");
//		System.out.println(bean);
	}

}
