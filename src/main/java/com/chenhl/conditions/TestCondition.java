package com.chenhl.conditions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @创建人: chenhl
 * @创建时间: 2020/7/2
 * @描述:
 */
public class TestCondition {

    public static void main(String[] args) {
        // 容器实例化
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        String osName = applicationContext.getEnvironment().getProperty("os.name");
        System.out.println("当前系统为：" + osName);
        Map<String, Person> map = applicationContext.getBeansOfType(Person.class);

        System.out.println(map);

    }
}
