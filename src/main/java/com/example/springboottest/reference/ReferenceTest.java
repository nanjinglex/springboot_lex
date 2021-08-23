package com.example.springboottest.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ReferenceTest.java
 * @Description TODO
 * @createTime 2021年08月23日 10:44:00
 */
public class ReferenceTest {
    public static void main(String[] args) {
        /**
         *         01.  强引用
         *
         *         这个就是我们创建的普通对象了~  当该对象被显示地赋值为 null 时，或者没有被其他存活的对象继续引用时，它就会成为垃圾收集器的目标，等待被收回
         *

         */

        /**
         *                   02.  软引用
         *
         *                   软引用( SoftReference ) , 当内存不足 时会被回收
         *                   比如
         */
        SoftReference<String> softReference = new SoftReference<>("lex");
        String name = softReference.get();
        System.out.println(name);


        /**
         * 03.  弱引用
         *
         * 弱引用( WeakReference ) , 当 垃圾回收器 进行垃圾回收时，无论内存足与否，它都会被垃圾回收器回收
         * 比如
         */

        WeakReference<String> weakReference = new WeakReference<>("fjx");
        String girl = weakReference.get();
        System.out.println(girl);

        /**
         * 04.  虚引用
         *
         *
         * 虚引用( ReferenceQueue ) , 这个也是随时会被回收，不过它的作用更像一个标记，当对象被回收时，它不为 null ，但是要注意，无论什么时候去调用 虚引用的 get 方法，都只能获取到一个 null 值。
         */





    }
}
