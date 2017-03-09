package com.qf.chapter27.interpreter.calculator;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by ios on 16/11/18.
 */
public class Calculator {
    private Expression expression;

    public Calculator(String expStr) {
        //定义一个栈,安排运算的先后顺序
        Stack<Expression> stack = new Stack<Expression>();
        //表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();
        //运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        //把计算结果抛出来
        this.expression = stack.pop();
    }

    //开始运算
    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }


}
