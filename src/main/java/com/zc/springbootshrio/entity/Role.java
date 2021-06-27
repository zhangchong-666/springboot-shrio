package com.zc.springbootshrio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:51
**/

/**
 * role
 */
@Data
@AllArgsConstructor
public class Role {
    /**
     * id
     */
    private Integer id;

    /**
     * roleName
     */
    private String roleName;
}