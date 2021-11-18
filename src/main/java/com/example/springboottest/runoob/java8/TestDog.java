package com.example.springboottest.runoob.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName TestDog.java
 * @Description TODO
 * @createTime 2021年11月16日 10:36:00
 */
class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
    public void bark(){
        System.out.println("动物可以叫");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }

    public void bark(){
        System.out.println("狗可以吠叫");
    }

}

public class TestDog{
    public static void main(String args[]){
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
        b.bark();

        Stack<Integer> st = new Stack<Integer>();
        st.push(2);

        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        map.entrySet().forEach(entry->System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue()));

        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }

    }

    private static void aa(){
        aa();
    }



}
