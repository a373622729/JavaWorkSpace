package com.qf.chapter12.proxy.extension.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ios on 16/10/25.
 */
public class GamePlayerIH implements InvocationHandler {

    //被代理者
    Class cls = null;

    //被代理的实例
    Object obj = null;

    //我要代理谁
    public GamePlayerIH(Object _obj) {
        this.obj = _obj;
    }

    //调用被代理的方法
    //被代理对象的所有方法都实现了
    //在这里可以增强原来的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);

        //如果是登录方法,就发送信息, 这就是AOP编程
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的帐号登录!");
        }
        return result;
    }
}
