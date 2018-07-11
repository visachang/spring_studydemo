package com.ioc.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by lenovo on 2018/7/8.
 */
public class Enegry implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,BeanPostProcessor,InitializingBean,DisposableBean {
    private String enegry;


    public void setEnegry(String enegry) {
        this.enegry = enegry;
    }

    public String getEnegry() {
        return enegry;
    }

    public void myInit(){
        System.out.println("【"+this.getClass().getSimpleName()+"】调用了自定义的myInit方法");
    }

    public void myDestory(){
        System.out.println("【"+this.getClass().getSimpleName()+"】调用了自定义的myDestory方法");
    }

    public void setBeanName(String s) {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用了BeanNameAware接口的setBeanName方法");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用了BeanFactoryAware接口的setBeanFactory方法");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用了ApplicationContextAware接口的setApplicationContext方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用了InitializingBean接口的afterPropertiesSet方法");
    }

    public void destroy() throws Exception {
        System.out.println("【"+this.getClass().getSimpleName()+"】调用了DisposableBean接口的destroy方法");
    }
}
