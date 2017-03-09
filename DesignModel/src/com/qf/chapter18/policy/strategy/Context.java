package com.qf.chapter18.policy.strategy;

/**
 * Created by ios on 16/11/4.
 */

/**
 * 这个类相当于一个锦囊,装着策略,给赵云用
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy _strategy) {
        this.strategy = _strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
