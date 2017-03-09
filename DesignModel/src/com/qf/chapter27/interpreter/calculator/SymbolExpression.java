package com.qf.chapter27.interpreter.calculator;

/**
 * Created by ios on 16/11/18.
 */
public abstract class SymbolExpression  extends Expression {
    protected Expression left;
    protected Expression right;

    //所有的解析公式都只关心自己左右两个表达式的结果
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


}
