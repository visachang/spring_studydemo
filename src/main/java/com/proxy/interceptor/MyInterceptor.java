package com.proxy.interceptor;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2018/7/7.
 */
public class MyInterceptor implements Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法前逻辑");
        return false;
    }

    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("取代被代理对象方法");
    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("反射方法后逻辑");
    }
}
