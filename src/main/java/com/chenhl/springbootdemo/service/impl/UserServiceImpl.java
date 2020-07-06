package com.chenhl.springbootdemo.service.impl;

import com.chenhl.springbootdemo.domain.User;
import com.chenhl.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
@Service
public class UserServiceImpl implements UserService {

    public User getById(Long id){
        //实体类User
        User user=new User(id,"User"+id);
        return user;
    }

}
