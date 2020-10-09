package com.chenhl.springdemo;

import com.chenhl.conditions.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @创建人: chenhl
 * @创建时间: 2020/7/2
 * @描述:
 */
public class Test {

    public static void main(String[] args) {
        // 容器实例化
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("11111111");
        Stream.of(beanDefinitionNames).forEach(System.out::println);
        System.out.println("22222222");
//        System.out.println(applicationContext.getBean(Z.class));
    }
}
