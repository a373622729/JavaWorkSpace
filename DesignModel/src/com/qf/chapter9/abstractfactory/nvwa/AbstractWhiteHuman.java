package com.qf.chapter9.abstractfactory.nvwa;

/**
 * Created by ios on 16/10/20.
 */
public abstract class AbstractWhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白色人种皮肤白色");
    }

    @Override
    public void talk() {
        System.out.println("白人说话");
    }

}
