package com.proxy.chainofresponsibility;

/**
 * Created by lenovo on 2018/7/8.
 */
public class RealObjImpl implements RealObj {
    public void leave(int days){
        System.out.println("员工甲申请"+days+"天假期");
    }
}
