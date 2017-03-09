package com.qf.chapter10.modelmethod.hummerextend;

/**
 * Created by ios on 16/10/21.
 */
//H2,默认喇叭不响
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H2start...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2stop...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2alarm...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2engineBoom...");
    }

    //H2,默认喇叭不响
    @Override
    protected boolean isArarm() {
        return false;
    }
}
