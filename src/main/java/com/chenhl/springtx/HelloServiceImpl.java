package com.chenhl.springtx;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @创建人: chenhl
 * @创建时间: 2020/9/4
 * @描述:
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String sayHello(String name) {
        System.out.println(name +"1111");
        int i = 1/0;
        System.out.println(name +"2222");

        return "tx: " + name;
    }
}
