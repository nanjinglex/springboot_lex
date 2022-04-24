package com.example.springboottest.runoob.Inet;

import java.io.IOException;
import java.net.*;

/**
 * 以下实例演示了如何检测端口是否已经使用：
 * @author lex
 * @version 1.0.0
 * @ClassName Demo2PortInUse.java
 * @Description TODO
 * @createTime 2021年11月22日 14:18:00
 */
public class Demo2PortInUse {
    public static void main(String[] args) {
        Socket Skt;
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 0; i < 1024; i++) {
            try {
                System.out.println("查看 "+ i);
                Skt = new Socket(host, i);
                System.out.println("端口 " + i + " 已被使用");
            }
            catch (UnknownHostException e) {
                System.out.println("Exception occured"+ e);
                break;
            }
            catch (IOException e) {
                System.out.println("IOException");
            }
        }
    }


}
