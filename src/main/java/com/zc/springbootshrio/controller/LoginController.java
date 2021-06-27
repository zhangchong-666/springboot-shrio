package com.zc.springbootshrio.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

/**
 * @Author 张sir
 * @Company 南邮
 * @Create 2021-05-29-16:10
 **/
@Slf4j
@Controller
public class LoginController {
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String userName, String passWord, Model model){
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(passWord)){
            model.addAttribute("msg","请输入用户名或密码");
            return "login";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName,passWord);
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            e.printStackTrace();
            model.addAttribute("msg","用户不存在");
            return "login";
        }catch (IncorrectCredentialsException e){
            e.printStackTrace();
            model.addAttribute("msg","密码错误");
            return "login";
        }catch (AuthorizationException e){
            log.error("没有权限！", e);
        }
        return "user/success";
    }

    @RequestMapping("/noauth")
    @ResponseBody
    public String noauth(){
        return "没有权限";
    }
}
