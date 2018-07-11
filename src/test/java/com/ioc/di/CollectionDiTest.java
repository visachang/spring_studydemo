package com.ioc.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * Created by lenovo on 2018/7/9.
 */
public class CollectionDiTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-collection.xml");
        CollectionDi collectionDi = (CollectionDi)context.getBean("collectionDi");
        Set<String> set = collectionDi.getSet();
        for (String str : set){
            System.out.println(str);
        }


        List<String> list = collectionDi.getList();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Map<Integer,String> map = collectionDi.getMap();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = (Integer)iterator.next();
            System.out.println(key+"="+map.get(key));
        }

        String[] array = collectionDi.getArray();
        System.out.println(Arrays.asList(array));

        Properties properties = collectionDi.getProperties();
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()){
            String key = (String)enumeration.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key+"="+value);
        }

    }
}
