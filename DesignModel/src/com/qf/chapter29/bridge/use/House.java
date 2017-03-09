package com.qf.chapter29.bridge.use;

/**
 * Created by ios on 16/11/21.
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
