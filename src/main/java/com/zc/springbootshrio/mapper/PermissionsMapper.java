package com.zc.springbootshrio.mapper;

import com.zc.springbootshrio.entity.Permissions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 张sir
 * @Company 南邮
 * @Create 2021-05-29-20:27
 **/
@Mapper
public interface   PermissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    Permissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);

    List<Permissions> getPermissions(@Param("id") Integer id);
}