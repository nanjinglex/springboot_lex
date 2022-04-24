package com.example.springboottest.javastack;

import lombok.Data;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName ProxyTest.java
 * @Description
 * @createTime 2022年02月10日 16:25:00
 */
public class ProxyTest {
    public static void main(String[] args) {
        testStaticProxy();//静态代理
    }

    private static void testStaticProxy() {
        User user = new User();
        user.setName("tom");
        new StaticProxy(new UserInterfaceImpl()).saveUser(user);
    }

    static class StaticProxy implements UserInterface {
        private UserInterface userInterface;

        public StaticProxy(UserInterface userInterface) {
            this.userInterface = userInterface;
        }

        @Override
        public boolean saveUser(User user) {
            System.out.println("静态代理-开始保存用户");
            boolean result = userInterface.saveUser(user);
            System.out.println("静态代理-保存用户结果: " + result);
            System.out.println();
            return result;
        }
    }






}


/**
 * 用户接口
 */
interface UserInterface {
    boolean saveUser(User user);
}

//用户接口实现
class UserInterfaceImpl implements UserInterface {
    @Override
    public boolean saveUser(User user) {
        System.out.println("保存用户: " + user.getName());
        return true;
    }
}


@Data
class User {
    private String name;
}


