package com.zc.springbootshrio.config;

import com.zc.springbootshrio.entity.Permissions;
import com.zc.springbootshrio.entity.Role;
import com.zc.springbootshrio.entity.User;
import com.zc.springbootshrio.service.PermissionsService;
import com.zc.springbootshrio.service.RoleService;
import com.zc.springbootshrio.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author 张sir
 * @Company 南邮
 * @Create 2021-05-29-15:48
 **/
public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    PermissionsService permissionsService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录用户名
        User user = (User) principalCollection.getPrimaryPrincipal();
        //查询用户名称
        /*User user = userService.selectUserByName(name);*/
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        for (Role r :
                roleService.getRoles(user.getId())) {
            //添加角色
            simpleAuthorizationInfo.addRole(r.getRoleName());
        }
        for(Permissions p:permissionsService.getPermissions(user.getId())){
            //添加权限
            simpleAuthorizationInfo.addStringPermission(p.getPermissionsName());
        }

       return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken userToken = (UsernamePasswordToken) authenticationToken;
        User user = userService.selectUserByName(userToken.getUsername());
        //判断账户是否存在
        if(user == null){
            return null;
        }
        //判断密码是否正确
        return new SimpleAuthenticationInfo(user,user.getPassWord(),"");
    }
}
