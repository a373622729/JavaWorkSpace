package com.qf.chapter22.observer.spy;

/**
 * Created by ios on 16/11/11.
 */
public class HanFeiZi implements IHanFeiZi {
    private boolean isHavingBreakfast = false;
    private boolean isHavingFun = false;



    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子要吃饭了...");
        this.isHavingBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子要娱乐了...");
        this.isHavingFun = true;

    }
}
