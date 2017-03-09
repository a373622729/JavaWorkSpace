package com.qf.chapter12.proxy.extension.dynamic.universal;

/**
 * Created by ios on 16/10/26.
 */

import java.lang.reflect.InvocationHandler;

/**
* 与静态代理的区别,
 * 可以在不改变现有代码结构的情况下,增强或控制对象的行为 ,被代理的类,必须要实现一个接口
* */
public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler h = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),h);
        proxy.doSomething("Finish");
        //SubjectDynamicProxy
//        Subject subject = new RealSubject();
//        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
//        proxy.doSomething("Before");
    }
}
