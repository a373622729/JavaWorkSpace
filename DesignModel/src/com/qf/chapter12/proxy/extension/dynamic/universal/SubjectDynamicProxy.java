package com.qf.chapter12.proxy.extension.dynamic.universal;

import java.lang.reflect.InvocationHandler;

/**
 * Created by ios on 16/10/26.
 */

/**
 * 实现类,这样会让Client访问更加方便
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        //获得classloader
        ClassLoader loader = subject.getClass().getClassLoader();

        //获得接口数组
        Class<?>[] interfaces = subject.getClass().getInterfaces();

        //获得Handler
        InvocationHandler handler = new MyInvocationHandler(subject);

        return DynamicProxy.newProxyInstance(loader,interfaces,handler);
    }
}
