package com.adrian.onlinejudgesystemcodesandbox.security;

import java.security.Permission;

/*
 * Date: 2024/10/4 11:15
 * Author: Adrian
 * Version: 1.0
 * Description: 禁用所有权限安全管理器
 * */
public class DenySecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常: " + perm.toString());
    }
}
