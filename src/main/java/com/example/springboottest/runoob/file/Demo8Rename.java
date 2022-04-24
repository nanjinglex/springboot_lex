package com.example.springboottest.runoob.file;

import java.io.File;
import java.io.IOException;

/**
 * 以下实例演示了使用 File 类的 oldName.renameTo(newName) 方法来重命名文件。
 * @author lex
 * @version 1.0.0
 * @ClassName Demo8Rename.java
 * @Description TODO
 * @createTime 2021年11月22日 11:30:00
 */
public class Demo8Rename {
    public static void main(String[] args) throws IOException {
        // 旧的文件或目录
        File oldName = new File("./runoob-test.txt");
        // 新的文件或目录
        File newName = new File("./runoob-test-2.txt");
        if (newName.exists()) {  //  确保新的文件名不存在
            throw new java.io.IOException("file exists");
        }
        if(oldName.renameTo(newName)) {
            System.out.println("已重命名");
        } else {
            System.out.println("Error");
        }
    }
}
