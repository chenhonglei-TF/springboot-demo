package com.chenhl.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @创建人: chenhl
 * @创建时间: 2020/7/2
 * @描述:
 */
@Component
public class Y implements ApplicationContextAware, InitializingBean {

    @Autowired
    X x;

    public Y() {
        System.out.println("y create");
    }

    @PostConstruct
    public void initY(){
        System.out.println("Y @PostConstruct called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Y ApplicationContextAware.setApplicationContext call");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Y InitializingBean.afterPropertiesSet call");
    }
}
