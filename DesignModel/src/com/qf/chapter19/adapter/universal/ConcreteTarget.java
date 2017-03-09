package com.qf.chapter19.adapter.universal;

/**
 * Created by ios on 16/11/7.
 */

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget request!");
    }
}
