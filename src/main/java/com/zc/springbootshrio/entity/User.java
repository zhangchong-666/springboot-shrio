package com.zc.springbootshrio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

/**
 * @Author 张sir
 * @Company 南邮
 * @Create 2021-05-29-15:32
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Slf4j
public class User {
    private Integer id;
    private String userName;
    private Integer age;
    private Integer sex;
    private String passWord;
}
