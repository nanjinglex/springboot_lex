package com.example.springboottest.runoob.file;

import java.io.File;

/**
 * 以下实例演示了使用 delete() 方法将文件删除：
 * @author lex
 * @version 1.0.0
 * @ClassName Demo3Delete.java
 * @Description
 * @createTime 2021年11月22日 09:53:00
 */
public class Demo3Delete {
    public static void main(String[] args)
    {
        try{
//            File file = new File("c:\\test.txt");
            File file = new File("test.txt");
            if(file.delete()){
                System.out.println(file.getName() + " 文件已被删除！");
            }else{
                System.out.println("文件删除失败！");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
