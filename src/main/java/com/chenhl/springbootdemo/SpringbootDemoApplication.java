package com.chenhl.springbootdemo;

import com.chenhl.springbootdemo.entity.RouteConfAppDO;
import com.chenhl.springbootdemo.service.RouteConfAppService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * springboot 加载bean的4种方式：
 * 1.传统xml方式，然后在启动类(或配置类)上加上 @ImportResource({"classpath:applicationContext.xml"，。。。})
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.chenhl.springbootdemo.mapper"})
//@ImportResource("classpath:applicationContext.xml")
public class SpringbootDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootDemoApplication.class, args);
        SpringApplication application = new SpringApplication(SpringbootDemoApplication.class);
        // 增加初始化器的一种方式，另一种是在classpath下新增一个MATE-INF目录
//        application.addInitializers(new ApplicationContextInitializerDemo());
        ConfigurableApplicationContext ctx = application.run(args);

        RouteConfAppService routeConfAppService = ctx.getBean(RouteConfAppService.class);
        RouteConfAppDO routeConfAppDO = new RouteConfAppDO();
        routeConfAppDO.setAppName("myAppName");
        routeConfAppDO.setAppCode("myAppCode");
        routeConfAppDO.setSystemCode("mySystemCode");

        routeConfAppDO.setSystemType("mySystemType");
        routeConfAppDO.setMemo("myMemo");
        routeConfAppDO.setCreateOperatorId(111L);
        routeConfAppDO.setModifyOperatorId(111L);
        routeConfAppService.save(routeConfAppDO);



    }
}
