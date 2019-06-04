package com.zjx.druid.service;

import com.zjx.druid.entity.User;
import com.zjx.druid.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-03 20:39
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
