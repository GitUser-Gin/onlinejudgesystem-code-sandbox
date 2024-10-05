package com.adrian.onlinejudgesystemcodesandbox.model;

import lombok.Data;

/*
 * Date: 2024/10/2 22:11
 * Author: Adrian
 * Version: 1.0
 * Description: 进程执行信息
 * */
@Data
public class ExecuteMessage {

    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;

    private Long memory;
}
