package com.chenhl.springbootdemo.web;

import com.chenhl.springbootdemo.service.RouteConfAppService;
import com.my.springboot.autoconfigure.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
@RestController
@RequestMapping(value = "/route/conf/app")
public class RouteConfAppController {

    @Autowired
    RouteConfAppService routeConfAppService;

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/all")
    @ResponseBody
    public Object queryAll(String appCode) {
        return routeConfAppService.queryAll(appCode);
    }

    public RouteConfAppController() {
        System.out.println("RouteConfAppController constractor invoked!");
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloService.sayHello(name);
    }


    @GetMapping("/info")
    public String info() {
        return helloService.helloworld();
    }
}
