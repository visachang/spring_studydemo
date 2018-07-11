package com.ioc.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lenovo on 2018/7/9.
 */
public class CollectionDi2Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-collection2.xml");
        CollectionDi2 collectionDi2 = (CollectionDi2)context.getBean("collectionDi2");

        Set<Role> set = collectionDi2.getSet();
        System.out.println(set);

        List<User> list = collectionDi2.getList();
        for(User user : list){
            System.out.println(user.getUserId()+"-->"+user.getUserName()+"--->"+user.getRole().toString());
        }

        Map<Role,User> map = collectionDi2.getMap();
        Set<Role> key = map.keySet();
        for (Role role : key){
            System.out.println(role+" | "+map.get(role).getUserName());
        }

    }
}
