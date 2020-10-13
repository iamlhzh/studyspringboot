package com.lhzh.suibianxiexieweb.config;

import com.lhzh.suibianxiexieweb.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 。
 *
 * @author 卢宏政
 */
@Configuration
public class StudentConfig {

    @Bean(name="myStudent",initMethod = "initStudent",destroyMethod = "destoryStudent")
    public Student getStudent(){
        Student stu = new Student();
        stu.setAge(11);
        stu.setName("嘿嘿");
        return stu;
    }
}
