package com.chenhl.springbootdemo.config;

import com.chenhl.springbootdemo.domain.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @创建人: chenhl
 * @创建时间: 2020/7/1
 * @描述:
 */
@Component
public class CatBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat) {
            System.out.println("CatBeanPostProcessor postProcessBeforeInitialization run ");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat) {
            System.out.println("CatBeanPostProcessor postProcessAfterInitialization run ");
            Cat cat = (Cat) bean;
            cat.setName("dog");
        }
        return bean;
    }

    public CatBeanPostProcessor() {
        System.out.println("CatBeanPostProcessor construct");
    }
}
