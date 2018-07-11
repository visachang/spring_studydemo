package com.ioc.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2018/7/9.
 */
public class SimpleValueDiTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.getUserId()+"-->"+user.getUserName()+"--->"+user.getRole().toString());
        context.close();
    }
}
