package com.reflect.method;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2018/7/7.
 */
public class MethodTest {
    private MethodNoParam methodNoParamObj;
    private MethodWithParam methodWithParamObj;
    private MethodWithReturnValue methodWithReturnValueObj;

    @Before
    public void setUp() throws Exception {
        methodNoParamObj = (MethodNoParam)Class.forName("com.reflect.method.MethodNoParam").newInstance();
        methodWithParamObj = (MethodWithParam)Class.forName("com.reflect.method.MethodWithParam").newInstance();
        methodWithReturnValueObj = (MethodWithReturnValue)Class.forName("com.reflect.method.MethodWithReturnValue").newInstance();

    }

    @Test
    public void testName() throws Exception {
        Method methodNoParam = methodNoParamObj.getClass().getMethod("sayHello",null);
        methodNoParam.invoke(methodNoParamObj);

        Method methodWithParam = methodWithParamObj.getClass().getMethod("sayHello",String.class);
        methodWithParam.invoke(methodWithParamObj,"有参方法");

        Method methodWithReturnValue = methodWithReturnValueObj.getClass().getMethod("sayHello",Integer.TYPE,Integer.TYPE);
        int returnValue = (Integer)methodWithReturnValue.invoke(methodWithReturnValueObj,5,9);
        System.out.println("返回值："+returnValue);
    }
}
