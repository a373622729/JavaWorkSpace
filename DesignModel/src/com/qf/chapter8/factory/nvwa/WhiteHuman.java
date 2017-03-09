package com.qf.chapter8.factory.nvwa;

/**
 * Created by ios on 16/10/19.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白人说话");
    }
}
