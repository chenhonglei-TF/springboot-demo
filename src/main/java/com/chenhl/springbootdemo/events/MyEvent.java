package com.chenhl.springbootdemo.events;

import org.springframework.context.ApplicationEvent;

/**
 * @创建人: chenhl
 * @创建时间: 2020/9/24
 * @描述:
 */
public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }
}
