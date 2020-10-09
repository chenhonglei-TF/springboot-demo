package com.chenhl.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @创建人: chenhl
 * @创建时间: 2020/9/4
 * @描述:
 */
@Configuration
@ComponentScan(basePackages = "com.chenhl.springaop")
@EnableAspectJAutoProxy
public class AppConfig {


}
