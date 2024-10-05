package com.adrian.onlinejudgesystemcodesandbox.model;

import lombok.Data;

/*
 * Date: 2024/9/17 20:48
 * Author: Adrian
 * Version: 1.0
 * Description: 题目判断信息
 * */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间(KB)
     */
    private Long time;
}
