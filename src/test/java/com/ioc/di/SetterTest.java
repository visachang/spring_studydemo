package com.ioc.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2018/7/9.
 */
public class SetterTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Role1 role1 = (Role1)context.getBean("role1");
        System.out.println(role1.toString());
        context.close();
    }
}
