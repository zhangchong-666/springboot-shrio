package com.zc.springbootshrio.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zc.springbootshrio.mapper.UserRoleMapper;
import com.zc.springbootshrio.entity.UserRole;
import com.zc.springbootshrio.service.UserRoleService;
/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:52
**/
@Service
public class UserRoleServiceImpl implements UserRoleService{

    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserRole record) {
        return userRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(UserRole record) {
        return userRoleMapper.insertSelective(record);
    }

    @Override
    public UserRole selectByPrimaryKey(Integer id) {
        return userRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserRole record) {
        return userRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        return userRoleMapper.updateByPrimaryKey(record);
    }

}
