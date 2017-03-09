package com.qf.chapter14.mediator.starmediator;

/**
 * Created by ios on 16/10/28.
 */

/**
 * 中介者定义了多个private方法,把原有一个对象要一代多个对象的情况,转移到中介者的private方法中实现.
 * 在项目中,一般做法是,终结者按照职责进行划分,每个中介者处理一个或多个类似的请求
 */
public class Mediator extends AbstractMediator {
    //java中,子类的构造方法第一句会隐含的调用super()如果父类没有这种形式的构造函数,那么编译的时候就会报错
//    public Mediator() {
//        super();
//    }
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyComputer((Integer)objects[0]);
        } else if (str.equals("sale.sell")) {
            this.sellComputer((Integer)objects[0]);
        } else if (str.equals("sale.offsell")) {
            this.offsell();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑" + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number >> 1;
            System.out.println("采购IBM电脑" + buyNumber + "台");
            super.stock.increase(buyNumber);
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offsell() {
        System.out.println("折价出售电脑" + super.stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offsell();
        super.purchase.refuseBuyIBM();
    }
}
