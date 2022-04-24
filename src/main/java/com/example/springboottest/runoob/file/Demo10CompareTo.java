package com.example.springboottest.runoob.file;

import java.io.File;

/**
 * 以下实例演示了使用 File 类的 filename.compareTo (another filename) 方法来比较两个文件路径是否是同一路径
 * 1.makdir()只能创建一级文件夹
 * 2.makdirs()可以创建多级的文件夹(只要没有就会帮你创建)
 * @author lex
 * @version 1.0.0
 * @ClassName Demo10CompareTo.java
 * @Description
 * @createTime 2021年11月22日 11:41:00
 */
public class Demo10CompareTo {
    public static void main(String[] args) {
        File file1 = new File("C:/File/demo1.txt");
        File file2 = new File("C:/File/demo2.txt");
        if(file1.compareTo(file2) == 0) {
            System.out.println("文件路径一致！");
        } else {
            System.out.println("文件路径不一致！");
        }


        File file3 = new File("d:/a/b/c/test");//创建单词文件夹
        boolean b2 = file3.mkdir();
        boolean b3 = file3.mkdirs();
        System.out.println(b2);
        System.out.println(b3);

        File file4 = new File("d:/a/b/c/test/s");//创建单词文件夹
        boolean b4 = file4.mkdirs();
        System.out.println(b4);
    }
}
