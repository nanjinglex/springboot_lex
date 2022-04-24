package com.example.springboottest.runoob.collection;

import org.apache.commons.exec.util.MapUtils;

import java.util.*;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo2Unmodifiable.java
 * @Description TODO
 * @createTime 2021年11月20日 16:18:00
 */
public class Demo2Unmodifiable {
    public static void main(String[] argv)
            throws Exception {
        List stuff = Arrays.asList(new String[] { "a", "b" });
        List list = new ArrayList(stuff);
        list = Collections.unmodifiableList(list);
        try {
            list.set(0, "new value");
        }
        catch (UnsupportedOperationException e) {
        }
        Set set = new HashSet(stuff);
        set = Collections.unmodifiableSet(set);
        Map map = new HashMap();
        map = Collections.unmodifiableMap(map);
        System.out.println("集合现在是只读");





    }
}
