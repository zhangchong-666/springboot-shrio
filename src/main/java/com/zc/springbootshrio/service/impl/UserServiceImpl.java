package com.zc.springbootshrio.service.impl;

import com.zc.springbootshrio.entity.User;
import com.zc.springbootshrio.mapper.UserMapper;
import com.zc.springbootshrio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 张sir
 * @Company 南邮
 * @Create 2021-05-29-15:43
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User selectUserByName(String userName) {
        return userMapper.selectUserByName(userName);
    }
}
