package com.zc.springbootshrio.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zc.springbootshrio.mapper.PermissionsMapper;
import com.zc.springbootshrio.entity.Permissions;
import com.zc.springbootshrio.service.PermissionsService;

import java.util.List;

/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:27
**/
@Service
public class PermissionsServiceImpl implements PermissionsService{

    @Resource
    private PermissionsMapper permissionsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return permissionsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Permissions record) {
        return permissionsMapper.insert(record);
    }

    @Override
    public int insertSelective(Permissions record) {
        return permissionsMapper.insertSelective(record);
    }

    @Override
    public Permissions selectByPrimaryKey(Integer id) {
        return permissionsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Permissions record) {
        return permissionsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Permissions record) {
        return permissionsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Permissions> getPermissions(Integer id) {
        return permissionsMapper.getPermissions(id);
    }

}
