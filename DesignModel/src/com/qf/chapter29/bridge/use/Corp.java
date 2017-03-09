package com.qf.chapter29.bridge.use;

/**
 * Created by ios on 16/11/21.
 */
public abstract class Corp {
    //定义一个产品的对象,具体不知道什么产品
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }
}
