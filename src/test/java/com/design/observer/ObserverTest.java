package com.design.observer;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2018/7/8.
 */
public class ObserverTest {
    private ProductList productList;
    private JDObserver jdObserver;
    private TBObserver tbObserver;

    @Before
    public void setUp() throws Exception {
        productList = ProductList.getInstance();
        jdObserver = new JDObserver();
        tbObserver = new TBObserver();
    }

    @Test
    public void testName() throws Exception {
        productList.addObserver(jdObserver);
        productList.addObserver(tbObserver);

        productList.addProduct("Iphone10");
    }
}
