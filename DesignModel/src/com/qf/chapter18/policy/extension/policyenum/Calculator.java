package com.qf.chapter18.policy.extension.policyenum;

/**
 * Created by ios on 16/11/4.
 */

/**
 * 把原有定义在抽象策略中的方法移植到枚举中,每个枚举成员就成为一个具体策略
 */
public enum  Calculator {
    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";
    //定义成员值类型
    //enum的构造函数默认是 private的
    private Calculator(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return value;
    }
    //声明一个抽象函数,在每个枚举成员中进行了实现
    public abstract int exec(int a, int b);
}
