package com.ioc.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by lenovo on 2018/7/8.
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【"+bean.getClass().getSimpleName()+"】对象"+beanName+"开始实例化");
        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【"+bean.getClass().getSimpleName()+"】对象"+beanName+"实例化完成");
        return bean;
    }
}
