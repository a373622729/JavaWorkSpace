package com.qf.chapter9.abstractfactory.universal;

/**
 * Created by ios on 16/10/20.
 */
public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMethod() {
        // TODO: 16/10/20
    }
    //每个产品相同方法,不同实现
    public abstract void doSomething();
}
