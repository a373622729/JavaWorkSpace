package com.qf.chapter9.abstractfactory.nvwa;

/**
 * Created by ios on 16/10/20.
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
