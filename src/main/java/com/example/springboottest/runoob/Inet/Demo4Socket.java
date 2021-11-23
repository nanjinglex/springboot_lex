package com.example.springboottest.runoob.Inet;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo4Socket.java
 * @Description TODO
 * @createTime 2021年11月22日 15:14:00
 */
public class Demo4Socket implements Runnable{
    Socket csocket;
    Demo4Socket(Socket csocket) {
        this.csocket = csocket;
    }

    public static void main(String args[])
            throws Exception {
        ServerSocket ssock = new ServerSocket(136);
        System.out.println("Listening");
        while (true) {
            Socket sock = ssock.accept();
            System.out.println("Connected");
            new Thread(new Demo4Socket(sock)).start();
        }
    }
    public void run() {
        try {
            PrintStream pstream = new PrintStream
                    (csocket.getOutputStream());
            for (int i = 100; i >= 0; i--) {
                pstream.println(i +
                        " bottles of beer on the wall");
            }
            pstream.close();
            csocket.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
