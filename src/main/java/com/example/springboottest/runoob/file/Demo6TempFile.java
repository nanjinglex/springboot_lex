package com.example.springboottest.runoob.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * 以下实例演示了使用 File 类的 createTempFile(String prefix, String suffix); 方法在默认临时目录来创建临时文件，参数 prefix 为前缀，suffix 为后缀
 * @author lex
 * @version 1.0.0
 * @ClassName Demo6TempFile.java
 * @Description TODO
 * @createTime 2021年11月22日 10:55:00
 */
public class Demo6TempFile {
    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("testrunoobtmp", ".txt");
        System.out.println("文件路径: "+temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已创建:");
        out.close();


        File f = null;
        try {
            //也可以使用 createTempFile(String prefix, String suffix, File directory) 中的 directory 参数来指定临时文件的目录：
            // 创建临时文件
            f = File.createTempFile("tmp", null, new File("D:/"));

            // 输出绝对路径
            System.out.print("File path: "+f.getAbsolutePath());

            // 终止后删除临时文件
            f.deleteOnExit();

        } catch(Exception e) {

            // 如果有错误输出内容
            e.printStackTrace();
        }
    }

}
