package com.proxy.cglib;

import com.proxy.jdk.RealObj;

/**
 * Created by lenovo on 2018/7/7.
 */
public class RealObjImpl implements RealObj{
    public void doAction() {
        System.out.println("我是租客，我要找房子");
    }
}
