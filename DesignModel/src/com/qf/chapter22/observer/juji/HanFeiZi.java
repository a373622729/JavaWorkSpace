package com.qf.chapter22.observer.juji;

/**
 * Created by ios on 16/11/11.
 */
public class HanFeiZi implements IHanFeiZi {
    private ILiSi liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        this.liSi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.liSi.update("韩非子在娱乐");
    }
}
