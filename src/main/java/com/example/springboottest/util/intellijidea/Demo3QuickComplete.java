package com.example.springboottest.util.intellijidea;

import cn.hutool.core.lang.func.VoidFunc0;
import jdk.nashorn.internal.objects.NativeNumber;
import lombok.val;
import org.aspectj.weaver.ast.Var;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3QuickComplete.java
 * @Description TODO
 * @createTime 2022年01月27日 17:04:00
 */
public class Demo3QuickComplete {
    static Object obj = new Object();

    private static String nam;

    public static void main(String[] args) {
        //1. .sout
        System.out.println();

        //2、快速定义局部变量 .var

        //3、快速定义成员变量 .field
        nam = "nam";

//        4、快速格式化字符串 .format
        String.format("name=%s", "ss");

        //5、快速判断（非）空
        // 像上面这种判断空/非空的情况非常多吧，其实可以快速生成 if 判断语句块，非空：.notnull 或者 .nn，空：.null。
        String qq = "qq";
        if (qq != null) {

        }
        if (qq == null) {

        }

        //6、快速取反判断
        //输入 .not 可以让布尔值快速取反，再输入 .if 可快速生成 if 判断语句块。
        boolean b = false;
        if (!b) {

        }

        //7、快速遍历集合
        //下面是几种 for 循环语句的快速生成演示，.for, .fori, .forr 都可以满足你的要求。


//9、快速生成同步锁
//在对象后面输入.synchronized，可以快速生成该对象的同步锁语句块。
        synchronized (obj) {

        }


        //10、快速生成JDK8语句
        //下面演示的是快速生成 Lambda 以及 Optional 语句。
        //System.out.println("java技术").lambda.var
        Runnable run = () -> System.out.println("java技术");
        Runnable rund = () -> System.out.println(22);
        //run.opt
        Optional.of(run);


    }

    //        8、快速返回值
//在值后面输入.return，可以让当前值快速返回。
    private String getName() {
        return "lex";
    }
}
