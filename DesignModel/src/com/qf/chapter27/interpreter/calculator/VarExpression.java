package com.qf.chapter27.interpreter.calculator;

import java.util.HashMap;

/**
 * Created by ios on 16/11/18.
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
