package com.lhzh.suibianxiexieweb.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * 。
 *
 * @author 卢宏政
 */
public class Student implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    public Student(){
        System.out.println("Student初始化");
    }

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("属性设置:"+name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware设置Bean的值:"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware设置BeanFactory的值:"+beanFactory.toString());
    }

    void initStudent(){
        System.out.println("初始化Student");
    }

    void destoryStudent(){
        System.out.println("销毁Student");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean的destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean的afterPropertiesSet");
    }
}
