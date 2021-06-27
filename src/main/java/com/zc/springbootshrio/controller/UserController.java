package com.zc.springbootshrio.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 张sir
 * @Company 南邮
 * @Create 2021-05-29-16:13
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/lookBook")
    public String lookBook(){
        return "user/lookbook";
    }

    @RequiresPermissions("add")
    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        return "ok";
    }
}
