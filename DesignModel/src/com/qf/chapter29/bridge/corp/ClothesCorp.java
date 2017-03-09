package com.qf.chapter29.bridge.corp;

/**
 * Created by ios on 16/11/21.
 */
public class ClothesCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("服装公司生成衣服...");
    }

    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服...");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}
