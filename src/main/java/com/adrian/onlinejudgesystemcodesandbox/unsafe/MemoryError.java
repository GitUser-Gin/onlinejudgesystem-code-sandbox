package com.adrian.onlinejudgesystemcodesandbox.unsafe;

import java.util.ArrayList;
import java.util.List;

/*
 * Date: 2024/10/3 19:11
 * Author: Adrian
 * Version: 1.0
 * Description: 无限占用空间(浪费系统内存)
 * */
public class MemoryError {
    public static void main(String[] args) throws InterruptedException{
        List<byte[]> bytes = new ArrayList<>();
        while (true) {
            bytes.add(new byte[10000]);
        }
    }
}
