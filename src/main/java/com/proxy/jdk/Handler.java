package com.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2018/7/7.
 */
public class Handler implements InvocationHandler {
    private Object target;

    public Object proxyObj(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是代理中介，我将竭诚为您服务！");
        Object returnValue = method.invoke(target,args);
        System.out.println("我是代理中介，我已收到您的委托！");
        return returnValue;
    }
}
