package com.ioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2018/7/8.
 */
public class LifeTest  {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

//        XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("context.xml"));
//        Enegry hev = (Enegry)context.getBean("hev");
//        System.out.println(hev.getEnegry());

        context.close();
    }
}
