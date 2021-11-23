package com.example.springboottest.runoob.exception;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ExceptionDemo4Customer.java
 * @Description TODO
 * @createTime 2021年11月20日 11:18:00
 */
public class ExceptionDemo4Customer {
    public static void main(String[] args) {
        try {
            throw new MyException("myexception");
        }catch (MyException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class MyException extends RuntimeException {
    MyException(String message) {
        super(message);
    }
}
