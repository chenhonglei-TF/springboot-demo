package com.chenhl.springbootdemo.service;

import com.chenhl.springbootdemo.domain.User;
import com.chenhl.springbootdemo.entity.RouteConfAppDO;

import java.util.List;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
public interface RouteConfAppService {

    List<RouteConfAppDO> queryAll(String appCode);

    int save(RouteConfAppDO routeConfAppDO);
}
