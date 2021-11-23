package com.example.springboottest.runoob.file;

import java.io.*;

/**
 * 以下实例演示了使用 BufferedWriter 类的 read 和 write 方法将文件内容复制到另一个文件：
 *
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3Delete.java
 * @Description
 * @createTime 2021年11月22日 09:53:00
 */
public class Demo4CopyContent {
    public static void main(String[] args) throws Exception {
        BufferedWriter out1 = new BufferedWriter(new FileWriter("srcfile"));
        out1.write("string to be copied\n");
        out1.write("append\n");

        //追加写
        out1 = new BufferedWriter(new FileWriter("srcfile",true));
        out1.write("append2");
        out1.close();
        InputStream in = new FileInputStream(new File("srcfile"));
        OutputStream out = new FileOutputStream
                (new File("destnfile"));
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        BufferedReader in1 = new BufferedReader(new FileReader("destnfile"));
        String str;
        while ((str = in1.readLine()) != null) {
            System.out.println(str);
        }
        in1.close();
//        copyFromDisk("d:\\test.txt","d:\\copytest.txt");
        System.out.println("copy success");
    }

    /**
     * copy
     *
     * @param fromPath
     * @param toPath
     * @throws Exception
     */
    public static void copyFromDisk(String fromPath, String toPath) throws Exception {
        FileInputStream in = new FileInputStream(fromPath);
        OutputStream out = new FileOutputStream
                (new File(toPath));
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    }
}
