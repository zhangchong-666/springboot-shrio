package com.zc.springbootshrio.mapper;

import com.zc.springbootshrio.entity.User;

/**
 * @Author 张sir
 * @Company 南邮
 * @Create 2021-05-29-15:40
 **/
public interface UserMapper {
    User selectUserByName(String userName);
}
