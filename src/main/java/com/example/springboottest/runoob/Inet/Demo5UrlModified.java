package com.example.springboottest.runoob.Inet;

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
public class Demo5UrlModified {
    public static void main(String[] argv) throws Exception {
        URL u = new URL("http://127.0.0.1/test/test.html");
        URLConnection uc = u.openConnection();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("test.html 文件最后修改时间 :" + ft.format(new Date(timestamp)));
    }

}
