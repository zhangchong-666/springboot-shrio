package com.zc.springbootshrio.service;

import com.zc.springbootshrio.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:51
**/
public interface RoleService{


    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

        List<Role> getRoles(@Param("id") Integer id);
}
