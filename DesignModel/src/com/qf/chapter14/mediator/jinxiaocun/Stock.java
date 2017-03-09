package com.qf.chapter14.mediator.jinxiaocun;

/**
 * Created by ios on 16/10/28.
 *
 * 库存管理
 */
public class Stock {
    //开始有100台电脑
    private static int COMPUTER_NUMBER = 100;
    //库存增加
    public void increase(int number) {
        COMPUTER_NUMBER += number;
        System.out.println("库存数量为:" + COMPUTER_NUMBER);
    }
    //库存降低
    public void decrease(int number) {
        COMPUTER_NUMBER -= number;
        System.out.println("库存数量为:" + COMPUTER_NUMBER);
    }
    //获得库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }
    //存货压力太大,就通知采购人员不要采购,销售人员尽快销售
    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为:" + COMPUTER_NUMBER);
        //要求折价销售
        sale.offset();
        //要求人员不再采购
        purchase.refuseBuyIBM();
    }
}
