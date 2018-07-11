package com.proxy.jdk;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2018/7/7.
 */
public class JdkProxyTest {

    private RealObj realObjImpl;
    private Handler handler;


    @Before
    public void setUp() throws Exception {
        realObjImpl = new RealObjImpl();
        handler = new Handler();
    }

    @Test
    public void testName() throws Exception {
        RealObj proxy = (RealObj)handler.proxyObj(realObjImpl);
        proxy.doAction();
    }
}
