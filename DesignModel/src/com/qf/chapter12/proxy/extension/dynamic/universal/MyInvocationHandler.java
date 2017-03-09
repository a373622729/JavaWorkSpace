package com.qf.chapter12.proxy.extension.dynamic.universal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ios on 16/10/26.
 */
public class MyInvocationHandler implements InvocationHandler {

    //被代理的对象
    private Object target = null;

    public MyInvocationHandler(Object _object) {
        this.target = _object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
