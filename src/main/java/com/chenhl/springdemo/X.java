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
public class X implements ApplicationContextAware, InitializingBean {

    @Autowired
    Y y;

    public X() {
        System.out.println("x create");
    }

    @PostConstruct
    public void initX(){
        System.out.println("X @PostConstruct called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("X ApplicationContextAware.setApplicationContext call");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("X InitializingBean.afterPropertiesSet call");
    }
}
