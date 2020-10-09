package com.chenhl.springtx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @创建人: chenhl
 * @创建时间: 2020/9/4
 * @描述:
 */

@SpringBootApplication
@EnableTransactionManagement
public class TxDemo {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(TxDemo.class, args);
        HelloService helloService = ctx.getBean(HelloService.class);
        helloService.sayHello("test");
    }
}
