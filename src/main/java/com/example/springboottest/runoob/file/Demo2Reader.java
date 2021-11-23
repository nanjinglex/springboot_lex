package com.example.springboottest.runoob.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 以下实例演示了使用 readLine() 方法来读取文件 runoob.txt 内容，其中 test.log 文件内容为：
 * @author lex
 * @version 1.0.0
 * @ClassName Demo2Reader.java
 * @Description TODO
 * @createTime 2021年11月22日 09:50:00
 */
public class Demo2Reader {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
        }
    }
}
