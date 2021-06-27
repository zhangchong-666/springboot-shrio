package com.zc.springbootshrio.service;

import com.zc.springbootshrio.entity.User;

/**
 * @Author 张sir
 * @Company 南邮
 * @Create 2021-05-29-15:42
 **/
public interface UserService {
    User selectUserByName(String userName);
}
