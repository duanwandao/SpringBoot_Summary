package com.zjx.pagehelper.mapper;


import com.github.pagehelper.Page;
import com.zjx.pagehelper.entity.User;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-03 20:40
 */
public interface UserMapper {

    Page<User> getUsers();
}
