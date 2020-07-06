package com.chenhl.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @创建人: chenhl
 * @创建时间: 2020/7/2
 * @描述:
 */
@Component
public class X {

    @Autowired
    Y y;

    public X() {
        System.out.println("x create");
    }
}
