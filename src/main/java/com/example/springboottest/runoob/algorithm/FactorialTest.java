package com.example.springboottest.runoob.algorithm;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName FactorialTest.java
 * @Description TODO
 * @createTime 2021年11月18日 20:45:00
 */
public class FactorialTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("factorial of %d is %d\n",i,factorial(i));
        }

        String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "substring";
        boolean found = false;
        int max = strSearch.length() - substring.length();
        testlbl:
        for (int i = 0; i <= max; i++) {
            int length = substring.length();
            int j = i;
            int k = 0;
            while (length-- != 0) {
                if(strSearch.charAt(j++) != substring.charAt(k++)){
                    continue testlbl;
                }
            }
            found = true;
            break testlbl;
        }
        if (found) {
            System.out.println("发现子字符串。");
        }
        else {
            System.out.println("字符串中没有发现子字符串。");
        }
    }

    public static long factorial(int n){
        if(n<=1)
            return n;
        else
            return factorial(n-1)*n;
    }
}
