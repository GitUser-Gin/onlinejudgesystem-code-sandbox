package com.adrian.onlinejudgesystemcodesandbox.unsafe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/*
 * Date: 2024/10/3 20:08
 * Author: Adrian
 * Version: 1.0
 * Description: 向取服务器写文件(植入危险程序)
 * */
public class WriteFileError {
    public static void main(String[] args) throws InterruptedException, IOException {
        String userDir = System.getProperty("user.dir");
        String filePath = userDir + File.separator + "src/main/resources/木马程序.bat";
        String errorProgram = "java -version 2>&1";
        Files.write(Paths.get(filePath), Arrays.asList(errorProgram));
        System.out.println("写入木马成功,你完了哈哈");
    }
}
