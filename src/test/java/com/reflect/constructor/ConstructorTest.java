package com.reflect.constructor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2018/7/7.
 */
public class ConstructorTest {
    private ConstructorNoParam constructorNoParam;
    private ConstructorWithParam constructorWithParam;

    @Before
    public void setUp() throws Exception {
        constructorNoParam = (ConstructorNoParam)Class.forName("com.reflect.constructor.ConstructorNoParam")
                .newInstance();
        constructorWithParam = (ConstructorWithParam)Class.forName("com.reflect.constructor.ConstructorWithParam")
                .getConstructor(String.class).newInstance("有参构造器");
    }

    @Test
    public void testName() throws Exception {
        constructorNoParam.sayHello("无参构造器");
        constructorWithParam.sayHello();
    }

    @After
    public void tearDown() throws Exception {


    }
}
