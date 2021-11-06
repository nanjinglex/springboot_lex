package com.example.springboottest.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName GlmapperGeneric.java
 * @Description TODO
 * @createTime 2021年10月22日 10:47:00
 */
public class GlmapperGeneric<T> {
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {
        // do nothing
        new GlmapperGeneric().noSpecifyType();
        new GlmapperGeneric().specifyType();



    }

    public static <T> void test(List<T> src){
        System.out.println(11);
    }

    private <T> void test(List<? super T> dst, List<T> src){
        for (T t : src) {
            dst.add(t);
        }
        new ArrayList<T>();
    }

    /**
     * 不指定类型
     */
    public void noSpecifyType(){
        GlmapperGeneric glmapperGeneric = new GlmapperGeneric();
        glmapperGeneric.set("test");
        // 需要强制类型转换
        String test = (String) glmapperGeneric.get();
        System.out.println(test);
    }

    /**
     * 指定类型
     */
    public void specifyType(){
        GlmapperGeneric<String> glmapperGeneric = new GlmapperGeneric();
        glmapperGeneric.set("test1");
        // 不需要强制类型转换
        String test = glmapperGeneric.get();
        System.out.println(test);
    }
}
