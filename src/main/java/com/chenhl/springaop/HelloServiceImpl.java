package com.chenhl.springaop;

import org.springframework.stereotype.Service;

/**
 * @创建人: chenhl
 * @创建时间: 2020/9/4
 * @描述:
 */
@Service
public class HelloServiceImpl implements HelloService {

    @MyLog
    @Override
    public String sayHello(String name) {
        String s = "hello: " + name;
        System.out.println(s);
        return s;
    }
}
