package com.zjx.mybatisgenerator.dao;

import com.zjx.mybatisgenerator.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}