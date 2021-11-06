package com.example.springboottest.util.reflex;

import com.example.springboottest.util.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo.java
 * @Description TODO
 * @createTime 2021年07月16日 10:35:00
 */
public class Demo {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        try {
            Student student = studentClass.newInstance();
            Method say = studentClass.getDeclaredMethod("say", String.class, String.class);
            say.setAccessible(true);
            say.invoke(student,"xiaoming","hello");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
