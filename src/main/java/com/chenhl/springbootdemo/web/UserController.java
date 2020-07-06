package com.chenhl.springbootdemo.web;

import com.chenhl.springbootdemo.domain.Cat;
import com.chenhl.springbootdemo.domain.User;
import com.chenhl.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人: chenhl
 * @创建时间: 2020/6/28
 * @描述:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    Cat cat;

    @GetMapping(value = "/detail/{id}")
    @ResponseBody
    public Object getUserById( @PathVariable(value = "id") Long id){
        User user = userService.getById(id);
        user.setCat(cat);
        return user;
    }
}
