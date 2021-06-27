package com.zc.springbootshrio.mapper;

import com.zc.springbootshrio.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:52
**/
@Mapper
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}