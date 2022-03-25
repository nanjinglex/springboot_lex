package com.example.springboottest.javastack;

//import org.springframework.cglib.proxy.Enhancer;
//import org.springframework.cglib.proxy.MethodInterceptor;
//import org.springframework.cglib.proxy.MethodProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lex
 * @version 1.0.0
 * @ClassName Demo4JdkDynamicProxy.java
 * @Description TODO
 * @createTime 2022年02月11日 09:30:00
 */
public class Demo4CGLibDynamicProxy  {

    public static void main(String[] args) {
        IRegisterService iRegisterService = new RegisterServiceImpl();
        InsertDataInterceptor interceptor = new InsertDataInterceptor();
        RegisterServiceImpl proxy = (RegisterServiceImpl) interceptor.getProxy(iRegisterService);
        proxy.register("RyanLee", "123");
    }
}

class InsertDataInterceptor implements MethodInterceptor {
    Object target;

    public Object getProxy(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    private void doBefore() {
        System.out.println("[Proxy]一些前置处理");
    }

    private void doAfter() {
        System.out.println("[Proxy]一些后置处理");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        doBefore();
        Object result = methodProxy.invoke(target, objects);
        doAfter();
        return result;
    }
}


//interface IRegisterService {
//    void register(String name, String pwd);
//}
//
//class RegisterServiceImpl implements IRegisterService {
//    @Override
//    public void register(String name, String pwd) {
//        System.out.println(String.format("【向数据库中插入数据】name：%s，pwd：%s", name, pwd));
//    }
//}
