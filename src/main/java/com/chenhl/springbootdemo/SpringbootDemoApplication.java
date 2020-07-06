package com.chenhl.springbootdemo;

import com.chenhl.springbootdemo.config.ApplicationContextInitializerDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
//        SpringApplication application = new SpringApplication(SpringbootDemoApplication.class);
//        application.addInitializers(new ApplicationContextInitializerDemo());
//        application.run(args);
    }
}
