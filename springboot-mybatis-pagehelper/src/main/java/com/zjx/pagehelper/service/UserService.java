package com.zjx.pagehelper.service;


import com.github.pagehelper.Page;
import com.zjx.pagehelper.entity.User;
import com.zjx.pagehelper.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-03 20:39
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Page<User> getUsers() {
        return userMapper.getUsers();
    }
}
