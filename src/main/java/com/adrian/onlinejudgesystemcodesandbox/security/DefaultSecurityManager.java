package com.adrian.onlinejudgesystemcodesandbox.security;

import java.security.Permission;

/*
 * Date: 2024/10/4 11:15
 * Author: Adrian
 * Version: 1.0
 * Description: 默认安全管理器
 * */
public class DefaultSecurityManager extends SecurityManager{
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何权限校验");
        System.out.println(perm);
        //super.checkPermission(perm);
    }
}
