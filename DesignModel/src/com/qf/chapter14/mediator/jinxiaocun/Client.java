package com.qf.chapter14.mediator.jinxiaocun;

/**
 * Created by ios on 16/10/28.
 */
public class Client {
    public static void main(String[] args) {
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑------");
        Purchase purchase = new Purchase();
        purchase.buyIBMcomputer(100);

        System.out.println("------销售人员销售电脑------");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);

        System.out.println("------库房管理人员清库处理------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
