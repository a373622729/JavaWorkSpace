package com.qf.chapter18.policy.universal;

/**
 * Created by ios on 16/11/4.
 */
public class ConcreteStrategy2 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}
