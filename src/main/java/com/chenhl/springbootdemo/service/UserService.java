package com.chenhl.springbootdemo.service;

import com.chenhl.springbootdemo.domain.User;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
public interface UserService {

    User getById(Long id);
}
