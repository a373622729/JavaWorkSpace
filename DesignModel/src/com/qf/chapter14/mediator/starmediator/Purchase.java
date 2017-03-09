package com.qf.chapter14.mediator.starmediator;

/**
 * Created by ios on 16/10/28.
 */

/**
 * 进货管理
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    //采购ibm电脑
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy",number);
    }
    //不采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
