package com.adrian.onlinejudgesystemcodesandbox.security;

import cn.hutool.core.io.FileUtil;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

/*
 * Date: 2024/10/4 11:48
 * Author: Adrian
 * Version: 1.0
 * Description:
 * */
class MySecurityManagerTest {
    @Test
    void testCheckRead() {
        System.setSecurityManager(new MySecurityManager());
        List<String> strings = FileUtil.readLines("E:\\Study\\code\\IDEA_code\\Project\\OnlineJudgeSystem\\onlinejudgesystem-code-sandbox\\src\\main\\resources\\application.yml", StandardCharsets.UTF_8);
    }

    @Test
    void testCheckWrite() {
        System.setSecurityManager(new MySecurityManager());
        FileUtil.writeString("aa", "aaa", StandardCharsets.UTF_8);
    }

    @Test
    void testCheckDelete() {

    }

    @Test
    void testCheckConnect() {

    }
}