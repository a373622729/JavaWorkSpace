package com.qf.chapter27.interpreter.calculator;

import java.util.HashMap;

/**
 * Created by ios on 16/11/18.
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
