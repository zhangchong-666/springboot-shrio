package com.zc.springbootshrio.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zc.springbootshrio.mapper.RolePermissionsMapper;
import com.zc.springbootshrio.entity.RolePermissions;
import com.zc.springbootshrio.service.RolePermissionsService;
/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:52
**/
@Service
public class RolePermissionsServiceImpl implements RolePermissionsService{

    @Resource
    private RolePermissionsMapper rolePermissionsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return rolePermissionsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RolePermissions record) {
        return rolePermissionsMapper.insert(record);
    }

    @Override
    public int insertSelective(RolePermissions record) {
        return rolePermissionsMapper.insertSelective(record);
    }

    @Override
    public RolePermissions selectByPrimaryKey(Integer id) {
        return rolePermissionsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RolePermissions record) {
        return rolePermissionsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RolePermissions record) {
        return rolePermissionsMapper.updateByPrimaryKey(record);
    }

}
