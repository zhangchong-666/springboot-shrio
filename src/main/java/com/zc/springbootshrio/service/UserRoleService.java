package com.zc.springbootshrio.service;

import com.zc.springbootshrio.entity.UserRole;
    /**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:52
**/
public interface UserRoleService{


    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

}
