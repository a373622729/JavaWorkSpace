package com.qf.chapter10.modelmethod.hummerextend;

/**
 * Created by ios on 16/10/21.
 */
public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    final public void run() {
        start();
        engineBoom();
        if (isArarm()) {
            alarm();
        }
        stop();
    }
    //钩子方法,用来约束行为
    protected boolean isArarm() {
        return true;
    }
}
