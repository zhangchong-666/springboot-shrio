package com.zc.springbootshrio.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zc.springbootshrio.mapper.RoleMapper;
import com.zc.springbootshrio.entity.Role;
import com.zc.springbootshrio.service.RoleService;

import java.util.List;

/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:51
**/
@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleMapper roleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    @Override
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Role> getRoles(Integer id) {
        return roleMapper.getRoles(id);
    }

}
