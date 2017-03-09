package com.qf.chapter12.proxy.extension.dynamic.universal;

/**
 * Created by ios on 16/10/26.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do Something ---> " + str);
    }
}
