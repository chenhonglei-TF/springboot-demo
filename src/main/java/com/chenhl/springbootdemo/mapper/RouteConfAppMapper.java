package com.chenhl.springbootdemo.mapper;


import com.chenhl.springbootdemo.entity.RouteConfAppDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RouteConfAppMapper {

    List<RouteConfAppDO> selectList(@Param("appCode") String appCode);


    int insert(RouteConfAppDO routeConfAppDO);
}