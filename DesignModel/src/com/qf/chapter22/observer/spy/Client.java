package com.qf.chapter22.observer.spy;

/**
 * Created by ios on 16/11/11.
 */

/**
 * java中启动多个线程
 * 1.继承Thread类,重写run方法,new SubThread(),再 subThread.start()就可以了
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        Spy spyBreakfast = new Spy(hanFeiZi,liSi,"breakfast");
        spyBreakfast.start();

        Spy spyFun = new Spy(hanFeiZi,liSi,"fun");
        spyFun.start();

        Thread.sleep(1000);
        //主线程等待1s再往下执行
        hanFeiZi.haveBreakfast();
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
