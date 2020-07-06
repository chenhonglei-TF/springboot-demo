package com.chenhl.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * @创建人: chenhl
 * @创建时间: 2020/7/2
 * @描述:
 */
public class Test {

    public static void main(String[] args) {
        // 容器实例化
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(applicationContext.getBean(X.class));
    }
}
