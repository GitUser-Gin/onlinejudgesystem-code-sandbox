package com.adrian.onlinejudgesystemcodesandbox.security;

import java.security.Permission;

/*
 * Date: 2024/10/4 11:15
 * Author: Adrian
 * Version: 1.0
 * Description: 禁用所有权限安全管理器
 * */
public class MySecurityManager extends SecurityManager {

    // 检查所有权限
    @Override
    public void checkPermission(Permission perm) {
        //super.checkPermission(perm);
    }

    // 检查程序是否可执行文件
    @Override
    public void checkExec(String cmd) {
        throw new SecurityException("checkExec 权限异常: " + cmd);
    }

    // 检查程序是否可读文件
    @Override
    public void checkRead(String file) {
//        throw new SecurityException("checkRead 权限异常: " + file);
    }

    // 检查程序是否可写文件
    @Override
    public void checkWrite(String file) {
//        throw new SecurityException("checkWrite 权限异常: " + file);
    }

    // 检查程序是否可删除文件
    @Override
    public void checkDelete(String file) {
//        throw new SecurityException("checkDelete 权限异常: " + file);
    }

    // 检查程序是否运行连接网络
    @Override
    public void checkConnect(String host, int port) {
//        throw new SecurityException("checkConnect 权限异常: " + host + ": " + port);
    }
}
