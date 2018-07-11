package com.proxy.chainofresponsibility;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2018/7/8.
 */
public class Chaintest {
    private RealObj proxy1;
    private RealObj proxy2;
    private RealObj proxy3;

    @Before
    public void setUp() throws Exception {
        RealObj realObj = new RealObjImpl();

        Handler handler1 = new Handler(realObj,"com.proxy.chainofresponsibility.Flow1Interceptor");
        proxy1 = (RealObj)handler1.getProxy();

        Handler handler2 = new Handler(proxy1,"com.proxy.chainofresponsibility.Flow2Interceptor");
        proxy2 = (RealObj)handler2.getProxy();

        Handler handler3 = new Handler(proxy2,"com.proxy.chainofresponsibility.Flow3Interceptor");
        proxy3 = (RealObj)handler3.getProxy();

    }

    @Test
    public void testName() throws Exception {
        proxy3.leave(3);
    }
}
