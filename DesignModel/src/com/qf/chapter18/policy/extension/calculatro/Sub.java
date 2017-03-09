package com.qf.chapter18.policy.extension.calculatro;

/**
 * Created by ios on 16/11/4.
 */
public class Sub implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
