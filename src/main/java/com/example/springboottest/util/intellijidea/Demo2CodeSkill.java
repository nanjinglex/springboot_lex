package com.example.springboottest.util.intellijidea;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo2CodeSkill.java
 * @Description
 * @createTime 2022年01月27日 15:31:00
 */
public class Demo2CodeSkill {
    public static void main(String[] args) {
        //1. ALT + ENTER introduce local variable 可以补全调用方法返回的类型
        String s = new String();

        // 2. ALT + ENTER inject language or reference可以补全调用方法返回的类型
        //language=JSON
        String json = "{\"name\": \"lex\",\"age\": 18}";
        //language=JSON
        String json2 = "{\"name\": \"www\",\"age\": 17}";
        //language=JSON
        String json3 = "";

        //3.CTRL + SHIFT + ENTER 在当前行任何地方可以快速在末尾生成分号；
        new String();
    }

    //2. CTRL + ALT + P 提取写死的参数到方法参数。
    private void test() {
        System.out.println("s");

        String.format("sss", "dd");
        String.valueOf("34");




    }

}
