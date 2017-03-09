package com.qf.chapter19.adapter.universal;

/**
 * Created by ios on 16/11/7.
 */

public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();
    }
}
