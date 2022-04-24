package com.example.springboottest.runoob.base;

import java.util.Arrays;

public class Demo1ArgsTest {

    String name;
    public static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);
        System.out.println("hello world");
        byte a = 68;

        int decimal = 100;
        int octal = 0144;//8进制
        int hexa =  0x64;//16进制
        System.out.println(decimal);
        System.out.println(octal);
        System.out.println(hexa);


    }
    public static void print(Demo1ArgsTest test){
        test.name ="";
    }

}
