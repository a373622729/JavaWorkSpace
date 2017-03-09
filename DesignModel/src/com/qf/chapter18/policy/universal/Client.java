package com.qf.chapter18.policy.universal;

/**
 * Created by ios on 16/11/4.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy;
        strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doSomething();
    }
}
