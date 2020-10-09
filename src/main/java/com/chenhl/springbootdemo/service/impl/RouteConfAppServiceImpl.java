package com.chenhl.springbootdemo.service.impl;

import com.chenhl.springbootdemo.entity.RouteConfAppDO;
import com.chenhl.springbootdemo.events.MyEvent;
import com.chenhl.springbootdemo.mapper.RouteConfAppMapper;
import com.chenhl.springbootdemo.service.RouteConfAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
@Service
public class RouteConfAppServiceImpl implements RouteConfAppService {

    @Autowired
    RouteConfAppMapper routeConfAppMapper;

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public List<RouteConfAppDO> queryAll(String appCode) {
        List<RouteConfAppDO> routeConfAppDOS = routeConfAppMapper.selectList(appCode);
        return routeConfAppDOS;
    }

    public RouteConfAppServiceImpl() {
        System.out.println("RouteConfAppServiceImpl constractor invoked!");
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public int save(RouteConfAppDO routeConfAppDO) {
        routeConfAppMapper.insert(routeConfAppDO);
        applicationEventPublisher.publishEvent(new MyEvent("新增"));
        System.out.println("--------------------");
        return 0;
    }
}
