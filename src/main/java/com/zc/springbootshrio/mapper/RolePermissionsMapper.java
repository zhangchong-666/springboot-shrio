package com.zc.springbootshrio.mapper;

import com.zc.springbootshrio.entity.RolePermissions;
import org.apache.ibatis.annotations.Mapper;

/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:52
**/
@Mapper
public interface RolePermissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermissions record);

    int insertSelective(RolePermissions record);

    RolePermissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermissions record);

    int updateByPrimaryKey(RolePermissions record);
}