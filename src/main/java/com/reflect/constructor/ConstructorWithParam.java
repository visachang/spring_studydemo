package com.reflect.constructor;

/**
 * Created by lenovo on 2018/7/7.
 */
public class ConstructorWithParam {
    private String name;
    public ConstructorWithParam(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello,"+name);
    }
}
