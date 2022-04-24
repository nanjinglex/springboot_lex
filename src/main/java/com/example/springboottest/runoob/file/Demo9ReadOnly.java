package com.example.springboottest.runoob.file;

import java.io.File;
import java.io.IOException;

/**
 * 以下实例演示了使用 File 类的 file.setReadOnly() 和 file.canWrite() 方法来设置文件只读：
 * @author lex
 * @version 1.0.0
 * @ClassName Demo9ReadOnly.java
 * @Description
 * @createTime 2021年11月22日 11:34:00
 */
public class Demo9ReadOnly {
    public static void main(String[] args) throws IOException {
        File file = new File("./runoob-test-2.txt");
        if(!file.exists())
            file.createNewFile();
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
//        file.setWritable(true);
    }
}
