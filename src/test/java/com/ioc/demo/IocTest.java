package com.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2018/7/8.
 */
public class IocTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Car oilCar = (OilCar)context.getBean("oilCar");
        oilCar.canDrive();
        Enegry oil = (Enegry)context.getBean("oil");
        oilCar.useEnegry(oil);

        Car evCar = (EvCar)context.getBean("evCar");
        evCar.canDrive();
        Enegry ev = (Enegry)context.getBean("ev");
        evCar.useEnegry(ev);

        Car hevCar = (HevCar)context.getBean("hevCar");
        hevCar.canDrive();
        Enegry hev = (Enegry)context.getBean("hev");
        hevCar.useEnegry(hev);
    }
}
