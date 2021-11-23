package com.example.springboottest.runoob.Inet;

import java.net.URL;
import java.net.URLConnection;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3UrlConnection.java
 * @Description TODO
 * @createTime 2021年11月22日 14:39:00
 */
public class Demo3UrlConnection {
    public static void main(String[] args) throws Exception {
        int size;
        URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
        URLConnection conn = url.openConnection();
        int connectTimeout = conn.getConnectTimeout();
        size = conn.getContentLength();
        if (size < 0)
            System.out.println("无法获取文件大小。");
        else
            System.out.println("文件大小为：" + size + " bytes");
        conn.getInputStream().close();



    }

}
