package com.zjx.druid.controller;


import com.zjx.druid.entity.User;
import com.zjx.druid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-03 20:46
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> lists() {
        return userService.getUsers();
    }

}
