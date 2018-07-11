package com.proxy.interceptor;

import com.proxy.jdk.Handler;
import com.proxy.jdk.RealObj;
import com.proxy.jdk.RealObjImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2018/7/7.
 */
public class InterceptorTest {

    private RealObj realObjImpl;
    private InterceptorHandler interceptorHandler;


    @Before
    public void setUp() throws Exception {
        realObjImpl = new RealObjImpl();
        interceptorHandler = new InterceptorHandler(realObjImpl,"com.proxy.interceptor.MyInterceptor");
    }

    @Test
    public void testName() throws Exception {
        RealObj proxy = (RealObj)interceptorHandler.getProxy();
        proxy.doAction();
    }
}
