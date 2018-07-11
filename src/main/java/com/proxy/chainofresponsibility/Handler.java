package com.proxy.chainofresponsibility;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2018/7/8.
 */
public class Handler implements InvocationHandler {
    private Object target;
    private String interceptorClass;
    private Object returnValue;

    public Handler(Object target,String interceptorClass){
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new Handler(target,interceptorClass));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(interceptorClass == null || "".equals(interceptorClass)){
            returnValue = method.invoke(target,args);
        }

        Interceptor interceptor = (Interceptor)Class.forName(interceptorClass).newInstance();
        if(interceptor.before(proxy,target,method,args)){
            returnValue = method.invoke(target,args);
        }else{
            interceptor.around(proxy,target,method,args);
        }
        interceptor.after(proxy,target,method,args);

        return returnValue;
    }
}
