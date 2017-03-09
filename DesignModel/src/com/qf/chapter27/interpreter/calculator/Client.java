package com.qf.chapter27.interpreter.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by ios on 16/11/18.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();

        HashMap<String, Integer> var = getValue(expStr);

        Calculator cal = new Calculator(expStr);

        System.out.println("运算结果为:" + expStr + " = " + cal.run(var));
    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式:");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                //解决重复参数的问题
                System.out.print("请输入"+ch+"的值:");
                if (!map.containsKey(String.valueOf(ch))) {
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
