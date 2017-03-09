package com.qf.chapter18.policy.universal;

/**
 * Created by ios on 16/11/4.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy _strategy) {
        this.strategy = _strategy;
    }

    public void doSomething() {
        this.strategy.doSomething();
    }
}
