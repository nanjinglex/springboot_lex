package com.example.springboottest.util;

import org.apache.curator.shaded.com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName CheckDiffList.java
 * @Description TODO
 * @createTime 2021年07月14日 09:45:00
 */
public class CheckDiffList implements Serializable {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        List<String> list1 = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("test" + i);
            list1.add("test" + (i * 2));
        }


        System.out.println(checkDiffrent(list, list1));
//        System.out.println(checkDiffrent1(list, list1));
        System.out.println(checkDiffrent4(list, list1));


//        List<Integer> intList = Lists.newArrayList();
        //        for (int i = 10; i > 0; i--) {
//            intList.add(i);
//        }

        List<Integer> intList = Arrays.asList(10,1,6,4,8,7,9,3,2,5);

//        Collections.sort(intList);//升序
//        Collections.reverse(intList);//反转
        System.out.println(intList.toString());
//        list1.sort(Comparator.comparing(String::hashCode));

    }


    /**
     * 方法一：使用循环遍历
     */
    private static boolean checkDiffrent(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        if (list.size() != list1.size()) {
            System.out.println("消耗时间：" + (System.nanoTime() - st));
            return false;
        }
        for (String str : list) {
            if (!list1.contains(str)) {
                System.out.println("消耗时间：" + (System.nanoTime() - st));
                return false;
            }
        }
        System.out.println("消耗时间：" + (System.nanoTime() - st));
        return true;
    }

    /**
     * 方法2：利用List的 retainAll的方法进行判断
     */
    private static boolean checkDiffrent1(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        System.out.println("消耗时间为：" + (System.nanoTime() - st));
        return !list.retainAll(list1);
    }





    /**
     * 使用stream流去比较两个数组是否相等
     * 方法5
     */
    private static boolean checkDiffrent4(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        System.out.println("消耗时间为： " + (System.nanoTime() - st));
        /** 先将集合转成stream流进行排序然后转成字符串进行比较 */
        String collect = list.stream().sorted().collect(Collectors.joining(","));
        System.out.println(collect);

        return list.stream().sorted().collect(Collectors.joining())
                .equals(list1.stream().sorted().collect(Collectors.joining()));
    }


    /**
     * 使用list自带的sort方法先进性排序，然后转成toString去判断两个集合是否相等
     * 方法6
     */
    private static boolean checkDiffrent5(List<String> list, List<String> list1) {
        long st = System.nanoTime();
        System.out.println("消耗时间为： " + (System.nanoTime() - st));
        list.sort(Comparator.comparing(String::hashCode));
        list1.sort(Comparator.comparing(String::hashCode));
        return list.toString().equals(list1.toString());
    }


}
