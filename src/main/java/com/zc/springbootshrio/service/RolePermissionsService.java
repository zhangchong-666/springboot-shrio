package com.zc.springbootshrio.service;

import com.zc.springbootshrio.entity.RolePermissions;
    /**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:52
**/
public interface RolePermissionsService{


    int deleteByPrimaryKey(Integer id);

    int insert(RolePermissions record);

    int insertSelective(RolePermissions record);

    RolePermissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermissions record);

    int updateByPrimaryKey(RolePermissions record);

}
