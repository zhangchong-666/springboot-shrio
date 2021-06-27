package com.zc.springbootshrio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:52
**/

/**
 * user_role
 */
@Data
@AllArgsConstructor
public class UserRole {
    /**
     * id
     */
    private Integer id;

    /**
     * uid
     */
    private Integer uid;

    /**
     * rid
     */
    private Integer rid;
}