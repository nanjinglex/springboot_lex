package com.example.springboottest.runoob.file;

import java.io.*;

/**
 * 以下实例演示了使用 write() 方法向文件写入内容：
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1Write.java
 * @Description
 * @createTime 2021年11月22日 09:42:00
 */
public class Demo1Write {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
            out.write("菜鸟教程");
            out.close();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
