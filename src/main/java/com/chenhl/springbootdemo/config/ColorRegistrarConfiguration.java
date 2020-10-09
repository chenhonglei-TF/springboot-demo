package com.chenhl.springbootdemo.config;

import com.chenhl.springbootdemo.domain.color.Yellow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
@Configuration
public class ColorRegistrarConfiguration {

    @Bean
    public Yellow yellow(){
        return new Yellow();
    }

    public ColorRegistrarConfiguration() {
        System.out.println("ColorRegistrarConfiguration constractor invoked!");
    }
}
