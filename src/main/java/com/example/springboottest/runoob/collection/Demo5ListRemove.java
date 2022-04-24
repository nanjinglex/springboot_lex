package com.example.springboottest.runoob.collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo5ListRemove.java
 * @Description TODO
 * @createTime 2022年02月07日 14:47:00
 */
public class Demo5ListRemove {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("a1", "ab2", "a3", "ab4", "a5", "ab6", "a7", "ab8", "a9"));


        /**
         * 报错
         * java.util.ConcurrentModificationException

         */

        for (String str : list) {

            if (str.contains("b")) {

                list.remove(str);

            }

        }


        /**
         * 报错：下标越界
         * java.lang.IndexOutOfBoundsException

         */

        int size = list.size();

        for (int i = 0; i < size; i++) {

            String str = list.get(i);

            if (str.contains("b")) {

                list.remove(i);

            }

        }


        /**
         * 正常删除，每次调用size方法，损耗性能，不推荐

         */

        for (int i = 0; i < list.size(); i++) {

            String str = list.get(i);

            if (str.contains("b")) {

                list.remove(i);

            }

        }


        /**
         * 正常删除，推荐使用

         */

        for (Iterator<String> ite = list.iterator(); ite.hasNext(); ) {

            String str = ite.next();

            if (str.contains("b")) {

                ite.remove();

            }

        }


        /**
         * 报错
         * java.util.ConcurrentModificationException

         */

        for (Iterator<String> ite = list.iterator(); ite.hasNext(); ) {

            String str = ite.next();

            if (str.contains("b")) {

                list.remove(str);

            }

        }



    }
}
