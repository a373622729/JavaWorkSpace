package com.qf.chapter14.mediator.starmediator;

import java.util.Random;

/**
 * Created by ios on 16/10/28.
 *
 * 销售管理
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell",number);
    }

    //反馈销售情况,0-100之间变化
    public int getSaleStatus() {
        Random random = new Random();
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑销售情况为:" + saleStatus);
        return saleStatus;
    }
    //折价处理
    public void offsell() {
        super.mediator.execute("sale.offsell");
    }
}
