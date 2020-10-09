package com.chenhl.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.stream.Stream;

/**
 * @创建人: chenhl
 * @创建时间: 2020/9/4
 * @描述:
 */

public class AopTest {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);

        System.out.println("==================");
        HelloService helloService = ctx.getBean(HelloService.class);
        String ret = helloService.sayHello("aop");
        System.out.println(ret);
    }
}
