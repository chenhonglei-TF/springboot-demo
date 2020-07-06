package com.chenhl.springbootdemo.config;

import com.chenhl.springbootdemo.annotation.EnableColor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
@EnableColor
@Configuration
public class ColorConfiguration {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ColorConfiguration.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }
}
