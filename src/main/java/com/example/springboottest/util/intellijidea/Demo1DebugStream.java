package com.example.springboottest.util.intellijidea;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo1DebugStream.java
 * @Description TODO
 * @createTime 2022年01月27日 15:13:00
 */
public class Demo1DebugStream {
    public static void main(String[] args) {
        //然后进入调试模式运行，当断点进入时，点击调试窗口的 Trace Current Stream Chain 按钮
        Stream.of(100, 200, 300, 400, 500)
                .mapToLong(e -> e * 10)
                .filter(e -> e > 2000)
                .forEach(System.out::println);

//Java 8 Stream 的调试不是问题了, 但我并没有找到像 Optional 链式调用的调试方式。
        //断点进入后，可以选中需要调试的部分链式代码片断，然后右键选中 Evaluate Expression 菜单（ALT + F8）进入表达式计算窗口：
        String s = Optional.of("hi,")
                .map(e -> e + "Java")
                .map(e -> e + "技术")
                .map(e -> e + "栈").get();
        System.out.println(s);
    }
}
