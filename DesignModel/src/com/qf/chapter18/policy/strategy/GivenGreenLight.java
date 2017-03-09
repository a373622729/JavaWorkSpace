package com.qf.chapter18.policy.strategy;

/**
 * Created by ios on 16/11/4.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行!");
    }
}
