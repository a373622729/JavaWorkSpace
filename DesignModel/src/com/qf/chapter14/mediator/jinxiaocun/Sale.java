package com.qf.chapter14.mediator.jinxiaocun;

import java.util.Random;

/**
 * Created by ios on 16/10/28.
 *
 * 销售管理
 */
public class Sale {
    //销售IBM电脑
    public void sellIBMComputer(int number) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number) {
            //库存不够
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");
        stock.decrease(number);
    }
    //反馈销售情况,0-100之间变化
    public int getSaleStatus() {
        Random random = new Random();
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑销售情况为:" + saleStatus);
        return saleStatus;
    }
    //折价处理
    public void offset() {
        Stock stock = new Stock();
        System.out.println("折价处理电脑:" + stock.getStockNumber() + "台");
        stock.decrease(stock.getStockNumber());
    }
}
