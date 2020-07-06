package com.chenhl.springbootdemo.domain;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * @创建人: chenhl
 * @创建时间: 2020/7/1
 * @描述:
 */
public class Cat implements InitializingBean {

    private String name;

    public Cat(String name) {
        System.out.println("cat constuctor run");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("cat @PostConstruct run ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet run ……");
    }
}
