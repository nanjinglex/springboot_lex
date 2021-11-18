package com.example.springboottest.runoob.java8;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName TestSuperSub2.java
 * @Description TODO
 * @createTime 2021年11月16日 10:17:00
 */

class SuperClass2 {
    private int n;

    public SuperClass2() {
        System.out.println("SuperClass2");
    }

    public SuperClass2(int n) {
        System.out.println("SuperClass2:n");
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}

class SubClass3 extends SuperClass2 {
    public SubClass3() {
//        super(100);
        System.out.println("SubClass3");
    }
    public SubClass3(int n) {
        super(n);
        System.out.println("SubClass3:n");

    }

}

public class TestSuperSub2 {
    public static void main(String[] args) {
        new SubClass3();
        new SubClass3(100);
    }


}
