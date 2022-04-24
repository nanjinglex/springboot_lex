package com.example.springboottest.controller;

import cn.hutool.core.util.RuntimeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Shell.java
 * @Description
 * @createTime 2021年12月27日 10:04:00
 */
@RestController
@RequestMapping("/shell")
public class ShellExecController {


    @GetMapping("/exec")
    public void shellExec(){
        try {

            String beforeName = "/home/lex/data/project/apps/a.txt";
            String afterName = "/home/lex/data/project/apps/b.txt";

            String cmd = "mv " + beforeName + " " + afterName;
//            String[] cmd = {"tar", "-cf", tarName, fileName};

            Process process = Runtime.getRuntime().exec(cmd);
//          process = Runtime.getRuntime().exec(cmd);
            int status = process.waitFor();
            if(status != 0){
                System.err.println("Failed to call shell's command and the return status's is: " + status);
            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        String str = RuntimeUtil.execForStr("ipconfig");
        System.out.println(str);
    }
}
