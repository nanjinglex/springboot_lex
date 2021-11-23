package com.example.springboottest.runoob.file;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName FileTest.java
 * @Description TODO
 * @createTime 2021年11月18日 22:39:00
 */
public class FileTest {
    public static void main(String[] args) {
//        File file = new File("./test2");
//        if(!file.exists()){
//            file.mkdirs();
//        }


//        deleteFloder(file);

        File dir = new File("D:");
        //获取所有文件
        String[] list = dir.list();
        File[] files = dir.listFiles();
//文件过滤
        FileFilter fileFilter = e -> e.isDirectory();
        //文件名过滤
        FilenameFilter FilenameFilter = (f, n) -> {
            return n.startsWith("b");
        };
        //查看系统根目录
        File[] roots = File.listRoots();
        for (File root : roots) {
            System.out.println(root.toString());
        }

        //Java 实例 - 查看当前工作目录
        String curDir = System.getProperty("user.dir");
        System.out.println("你当前的工作目录为 :" + curDir);

        files = dir.listFiles(fileFilter);
        System.out.println(files.length);
        if (files.length == 0) {
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (int i = 0; i < files.length; i++) {
                File filename = files[i];
                System.out.println(filename.toString());
            }
        }

//java8
        File dir1 = new File("D:");
        File[] files1 = dir1.listFiles(file -> file.isDirectory());
        Stream.of(
                Optional.ofNullable(files1).orElse(new File[]{})).map(File::getName).forEach(System.out::println);


        Stream.of("q", "w", "e").forEach(System.out::println);

        Arrays.asList("q", "w", "e").stream().forEach(System.out::println);
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3});


        ArrayList<Dog> objects = new ArrayList<>();
        objects.add(new Dog("a", "b"));
        objects.add(new Dog("c", "d"));

        Stream<String> stringStream = objects.stream().map(d -> d.getName());
//        objects.stream().sorted((q1,q2)->{
//            if(){
//                return
//            }else{
//
//            }
//
//        }).forEach(System.out::println);
        objects.stream().map(d -> d.getName()).collect(Collectors.toList()).stream().forEach(System.out::println);


        Stream<ArrayList<Dog>> objects1 = Stream.of(objects);

        System.out.println("----------------->>>遍历目录");
        visitAllDirsAndFiles(new File("d:/upup"));
    }

    //删除目录
    public static void deleteFloder(File file) {
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                deleteFloder(listFile);
            }
        }
        file.delete();
    }

    //Java 实例 - 遍历目录
    public static void visitAllDirsAndFiles(File dir) {
        System.out.println(dir);
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                visitAllDirsAndFiles(new File(dir, children[i]));
            }
        }
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Dog {
    private String name;
    private String nickName;
}
