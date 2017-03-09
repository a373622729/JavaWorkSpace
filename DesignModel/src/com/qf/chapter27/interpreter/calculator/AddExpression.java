package com.qf.chapter27.interpreter.calculator;

import java.util.HashMap;

/**
 * Created by ios on 16/11/18.
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //把左右两个表达式加起来
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
