package com.example.springboottest.runoob.java8;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName TestIt.java
 * @Description TODO
 * @createTime 2021年11月15日 11:34:00
 */
class TestIt {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        myArray = ChangeIt.doIt(myArray);
        for (int j = 0; j < myArray.length; j++)
            System.out.print(myArray[j] + " ");
    }
}

class ChangeIt {
    static int[] doIt(int[] z) {
        z = null;
        return z;
    }
}