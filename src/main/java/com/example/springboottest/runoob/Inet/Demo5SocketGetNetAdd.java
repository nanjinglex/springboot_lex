package com.example.springboottest.runoob.Inet;

import java.net.InetAddress;
import java.net.Socket;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo5SocketGetNetAdd.java
 * @Description TODO
 * @createTime 2021年11月22日 15:58:00
 */
public class Demo5SocketGetNetAdd {
    public static void main(String[] args) {
        try {
            InetAddress addr;
            Socket sock = new Socket("www.runoob.com", 80);
            addr = sock.getInetAddress();
            System.out.println("连接到 " + addr);
            sock.close();
        } catch (java.io.IOException e) {
            System.out.println("无法连接 " + args[0]);
            System.out.println(e);
        }
    }
}
