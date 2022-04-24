package com.example.springboottest.runoob.Inet;

import java.io.IOException;
import java.net.*;

/**
 * 也可以指定主机的端口：
 * @author lex
 * @version 1.0.0
 * @ClassName Demo2PortInUse.java
 * @Description
 * @createTime 2021年11月22日 14:18:00
 */
public class Demo2PortInUse2 {
    public static void main(String[] args) {
        // 检测本地 80 端口
        log(isSocketAliveUitlitybyCrunchify("localhost", 80));

        // 检测本地 8080 端口
        log(isSocketAliveUitlitybyCrunchify("localhost", 8080));

        // 检测本地 8081 端口
        log(isSocketAliveUitlitybyCrunchify("localhost", 8081));

        // 检测 runoob.com 的 80 端口
        log(isSocketAliveUitlitybyCrunchify("runoob.com", 80));

        // 检测 runoob.com 的 443 端口
        log(isSocketAliveUitlitybyCrunchify("runoob.com", 443));

        // 检测 runoob.com 的 81 端口
        log(isSocketAliveUitlitybyCrunchify("runoob.com", 81));
    }

    /**
     * 判断主机端口
     *
     * @param hostName
     * @param port
     * @return boolean - true/false
     */
    public static boolean isSocketAliveUitlitybyCrunchify(String hostName, int port) {
        boolean isAlive = false;

        // 创建一个套接字
        SocketAddress socketAddress = new InetSocketAddress(hostName, port);
        Socket socket = new Socket();

        // 超时设置，单位毫秒
        int timeout = 2000;

        log("hostName: " + hostName + ", port: " + port);
        try {
            socket.connect(socketAddress, timeout);
            socket.close();
            isAlive = true;

        } catch (SocketTimeoutException exception) {
            System.out.println("SocketTimeoutException " + hostName + ":" + port + ". " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println(
                    "IOException - Unable to connect to " + hostName + ":" + port + ". " + exception.getMessage());
        }
        return isAlive;
    }

    private static void log(String string) {
        System.out.println(string);
    }

    private static void log(boolean isAlive) {
        System.out.println("是否真正在使用: " + isAlive + "\n");
    }
}
