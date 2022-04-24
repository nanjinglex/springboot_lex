package com.example.springboottest.runoob.java8;

import java.util.*;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName RunoobTest.java
 * @Description
 * @createTime 2021年11月15日 14:49:00
 */
class RunoobTest {
    public static void main(String[] args) {
//        System.out.println("请输入数字：");
//        Scanner scan = new Scanner(System.in);
//
//        double sum = 0;
//        int m = 0;
//
//        while (scan.hasNextDouble()) {
//            double x = scan.nextDouble();
//            m = m + 1;
//            sum = sum + x;
//        }
//
//        System.out.println(m + "个数的和为" + sum);
//        System.out.println(m + "个数的平均值是" + (sum / m));
//        scan.close();

        System.out.println("---------------->>hashmap");
        HashMap<Object, Object> map = new HashMap<>();
        map.put(null, null);
        map.put(null, "ww");
        map.put(1, null);
        System.out.println(map.size());
        System.out.println(map.get(null));
        map.entrySet().forEach(entry-> System.out.println(entry.getKey()+":"+entry.getValue()));

        Iterator<Object> iterator = new ArrayList<>().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


        System.out.println("---------------->>clone");
        HashMap<Object, Object> clone = (HashMap<Object, Object>)map.clone();
        System.out.println(clone.get(null));

        System.out.println("---------------->>hashset");
        HashSet<Object> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.size());

        System.out.println("---------------->>hashtable");
        Hashtable<Object, Object> table = new Hashtable<>();
//        table.put(null, null);//空指针 key value都不能为null
        table.put(1, 1);
        System.out.println(table.size());

        System.out.println("---------------->>泛型");
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);


    }

    public static <E> void printArray(E[] inputArray){
        for (E e : inputArray) {
            System.out.print(e);
        }
        System.out.println();
    }
}
