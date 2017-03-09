package com.qf.chapter27.interpreter.calculator;

import java.util.HashMap;

/**
 * Created by ios on 16/11/18.
 */
public abstract class Expression {
    //解析公式和数值,var中的key是参数,value是具体数字
    public abstract int interpreter(HashMap<String, Integer> var);
}
