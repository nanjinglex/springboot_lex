package com.example.springboottest.runoob.file;

import java.io.File;
import java.util.Date;

/**
 * 以下实例演示了使用 File 类的 fileToChange.lastModified() 和 fileToChange setLastModified() 方法来修改文件最后的修改日期：
 * @author lex
 * @version 1.0.0
 * @ClassName Demo7LastModified.java
 * @Description
 * @createTime 2021年11月22日 11:18:00
 */
public class Demo7LastModified {
    public static void main(String[] args) throws Exception {
        File fileToChange = new File("d:/test.txt");
        System.out.println(String.format("文件大小为：%d 字节（Byte）",fileToChange.length()));
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}
