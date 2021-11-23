package com.example.springboottest.runoob.Inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 以下实例演示了如何使用 InetAddress 类的 InetAddress.getByName() 方法来获取指定主机（网址）的IP地址：
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1InetAdress.java
 * @Description
 * @createTime 2021年11月22日 14:04:00
 */
public class Demo1InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.runoob.com");
            //            address = InetAddress.getByName("www.baidu.com");

            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost.getHostName());
            System.out.println(localHost.getHostAddress());

        }
        catch (UnknownHostException e) {
            System.exit(2);
        }


        System.out.println(address.getHostName() + "=" + address.getHostAddress());
        System.exit(0);
    }
}
