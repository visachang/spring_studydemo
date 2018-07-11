package com.proxy.cglib;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2018/7/7.
 */
public class CglibProxyTest {
    private Handler handler;

    @Before
    public void setUp() throws Exception {
        handler = new Handler();
    }

    @Test
    public void testName() throws Exception {
        RealObjImpl proxy = (RealObjImpl)handler.proxyObj(RealObjImpl.class);
        proxy.doAction();
    }
}
