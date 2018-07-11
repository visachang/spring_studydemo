package com.ioc.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2018/7/9.
 */
public class ConstructorTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Role role = (Role)context.getBean("role");
        System.out.println(role.toString());
        context.close();
    }
}
