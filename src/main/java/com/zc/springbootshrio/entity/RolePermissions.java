package com.zc.springbootshrio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:52
**/

/**
 * role_permissions
 */
@Data
@AllArgsConstructor
public class RolePermissions {
    /**
     * id
     */
    private Integer id;

    /**
     * rid
     */
    private Integer rid;

    /**
     * pid
     */
    private Integer pid;
}