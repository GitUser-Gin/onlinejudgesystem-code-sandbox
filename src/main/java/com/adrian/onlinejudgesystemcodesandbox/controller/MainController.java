package com.adrian.onlinejudgesystemcodesandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Date: 2024/10/2 15:58
 * Author: Adrian
 * Version: 1.0
 * Description:
 * */
@RestController("/")
public class MainController {
    @GetMapping("/health")
    public String healthCheck() {
        return "ok";
    }
}
