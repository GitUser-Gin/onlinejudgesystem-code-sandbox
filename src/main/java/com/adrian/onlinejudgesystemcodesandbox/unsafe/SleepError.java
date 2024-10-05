package com.adrian.onlinejudgesystemcodesandbox.unsafe;

/*
 * Date: 2024/10/3 18:37
 * Author: Adrian
 * Version: 1.0
 * Description: 无限睡眠(阻塞程序执行)
 * */
public class SleepError {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR = 60 * 60 * 1000L;
        Thread.sleep(ONE_HOUR);
        System.out.println("程序苏醒了");
    }
}
