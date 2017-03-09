package com.qf.chapter10.modelmethod.hummer;

/**
 * Created by ios on 16/10/21.
 */

//抽象模板
public abstract class HummerModel {
    //基本方法

    /**
     * 抽象模板中的基本方法尽量设计为protected类型,符合迪迷特法则,
     * 不需要暴露的属性或方法尽量不要设置为protected类型
     */
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    //模板方法,加上final,不允许覆写
    public final void run() {
        start();
        engineBoom();
        alarm();
        stop();
    }
}
