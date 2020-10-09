package com.chenhl.springbootdemo.config;

import com.chenhl.springbootdemo.domain.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人: chenhl
 * @创建时间: 2020/7/1
 * @描述:
 */
@Configuration
public class CatConfigurationDemo {

    @Bean
    public Cat cat(){
        return new Cat("cat");
    }

    public CatConfigurationDemo() {
        System.out.println("CatConfigurationDemo constractor invoked!");
    }
}
