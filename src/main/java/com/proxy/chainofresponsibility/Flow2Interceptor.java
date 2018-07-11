package com.proxy.chainofresponsibility;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2018/7/8.
 */
public class Flow2Interceptor implements Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        boolean isPassed = true;
        System.out.println("中级审批是否通过?"+isPassed);
        return isPassed;
    }

    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("中级审批未通过流程");
    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("中级审批后续流程");
    }
}
