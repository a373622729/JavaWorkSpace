package com.qf.chapter8.factory.nvwa;

/**
 * Created by ios on 16/10/19.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话");
    }
}
