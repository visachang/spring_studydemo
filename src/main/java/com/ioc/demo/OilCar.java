package com.ioc.demo;

/**
 * Created by lenovo on 2018/7/8.
 */
class OilCar implements Car {

    private Enegry enegryObj;

    public Enegry getEnegryObj() {
        return enegryObj;
    }

    public void setEnegryObj(Enegry enegryObj) {
        this.enegryObj = enegryObj;
    }

    public void canDrive() {
        System.out.println("烧油汽车可以驾驶");
    }

    public void useEnegry(Enegry enegryObj) {
        System.out.println("烧油汽车使用"+enegryObj.getEnegry()+"作为能源");
    }
}
