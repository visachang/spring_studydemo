package com.design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lenovo on 2018/7/8.
 */
public class TBObserver implements Observer {
    public void update(Observable o, Object product) {
        String newProduct = (String)product;
        System.out.println("发送新产品【"+newProduct+"】到淘宝商城");
    }
}
