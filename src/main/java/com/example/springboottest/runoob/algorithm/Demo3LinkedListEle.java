package com.example.springboottest.runoob.algorithm;

import java.util.LinkedList;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3LinkedListEle.java
 * @Description TODO
 * @createTime 2021年11月20日 11:46:00
 */
public class Demo3LinkedListEle {
    private LinkedList list = new LinkedList();
    public void push(Object v) {
        list.addFirst(v);
    }
    public Object top() {
        return list.getFirst();
    }
    public Object pop() {
        return list.removeFirst();
    }
    public static void main(String[] args) {
        Demo3LinkedListEle stack = new Demo3LinkedListEle();
        for (int i = 30; i < 40; i++)
            stack.push(new Integer(i));
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
