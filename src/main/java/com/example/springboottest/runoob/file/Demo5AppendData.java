package com.example.springboottest.runoob.file;

import java.io.*;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo5AppendData.java
 * @Description TODO
 * @createTime 2021年11月22日 10:52:00
 */
public class Demo5AppendData {
    public static void main(String[] args) throws Exception {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
            out.write("aString1\n");
            out.close();
            out = new BufferedWriter(new FileWriter("filename",true));
            out.write("aString2");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("filename"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured"+ e);
        }
    }
}
