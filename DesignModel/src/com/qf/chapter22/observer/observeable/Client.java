package com.qf.chapter22.observer.observeable;

/**
 * Created by ios on 16/11/11.
 */
public class Client {
    public static void main(String[] args) {
        Observer liSi = new Lisi();
        Observer wangsi = new WangSi();
        Observer liusi = new LiuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangsi);
        hanFeiZi.addObserver(liSi);

        hanFeiZi.haveBreakfast();
    }
}
