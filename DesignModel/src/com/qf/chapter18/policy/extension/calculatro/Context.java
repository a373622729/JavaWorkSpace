package com.qf.chapter18.policy.extension.calculatro;

/**
 * Created by ios on 16/11/4.
 */
public class Context {
    private Calculator calculator;
    public Context(Calculator _calculator) {
        this.calculator = _calculator;
    }

    int exec(int a, int b, String symbol) {
        return this.calculator.exec(a, b);
    }
}
