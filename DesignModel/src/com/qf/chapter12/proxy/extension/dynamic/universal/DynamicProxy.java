package com.qf.chapter12.proxy.extension.dynamic.universal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by ios on 16/10/26.
 */

/**
 * 这是一个通用类,没有有业务意思,所以可以实现它来让Client访问更方便
 * @param <T>
 */
public class DynamicProxy <T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        if (true) {
            //执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        return (T)Proxy.newProxyInstance(loader, interfaces, h);
    }
}
