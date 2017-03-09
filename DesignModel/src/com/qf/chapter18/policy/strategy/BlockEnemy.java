package com.qf.chapter18.policy.strategy;

/**
 * Created by ios on 16/11/4.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后,挡住追兵");
    }
}
