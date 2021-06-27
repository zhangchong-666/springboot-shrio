package com.zc.springbootshrio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 @Author 张sir
 @Company 南邮
 @Create 2021-05-29-20:27
**/

/**
 * permissions
 */
@Data
@AllArgsConstructor
public class Permissions {
    /**
     * id
     */
    private Integer id;

    /**
     * permissionsName
     */
    private String permissionsName;
}