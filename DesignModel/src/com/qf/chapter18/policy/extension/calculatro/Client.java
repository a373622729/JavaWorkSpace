package com.qf.chapter18.policy.extension.calculatro;


import java.util.Arrays;

/**
 * Created by ios on 16/11/4.
 */
public class Client {
    public static final String ADD_SYMBOL = "+";
    public static final String SUB_SYMBOL = "-";
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);

        System.out.println("输入的参数为:" + Arrays.toString(args));

        Context context = null;
        if (symbol.equals(ADD_SYMBOL)) {
            context = new Context(new Add());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context = new Context(new Sub());
        }

        System.out.println("运行结果为:" + a + symbol + b + "=" + context.exec(a,b,symbol));
    }
}
