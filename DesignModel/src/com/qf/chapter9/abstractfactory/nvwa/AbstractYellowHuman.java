package com.qf.chapter9.abstractfactory.nvwa;

/**
 * Created by ios on 16/10/20.
 */
public abstract class AbstractYellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄人皮肤");
    }

    @Override
    public void talk() {
        System.out.println("黄人说话");
    }
}
