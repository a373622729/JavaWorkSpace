package com.qf.chapter29.bridge.corp;

/**
 * Created by ios on 16/11/21.
 */
public class HouseCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子...");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司出售房子...");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
