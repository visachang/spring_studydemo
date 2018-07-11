package com.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2018/7/7.
 */
public class Handler implements MethodInterceptor {

    public Object proxyObj(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是代理中介，我将竭诚为您服务！");
        Object returnValue = methodProxy.invokeSuper(proxy,args);
        System.out.println("我是代理中介，我已收到您的委托！");
        return returnValue;
    }
}
