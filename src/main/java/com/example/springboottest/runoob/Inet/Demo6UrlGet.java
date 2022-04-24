package com.example.springboottest.runoob.Inet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3UrlConnection.java
 * @Description
 * @createTime 2021年11月22日 14:39:00
 */
public class Demo6UrlGet {
    public static void main(String[] args)
            throws Exception {
        URL url = new URL("http://www.runoob.com");

        BufferedReader reader = new BufferedReader
                (new InputStreamReader(url.openStream()));
        BufferedWriter writer = new BufferedWriter
                (new FileWriter("data.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }

}
