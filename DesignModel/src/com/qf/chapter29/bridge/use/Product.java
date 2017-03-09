package com.qf.chapter29.bridge.use;

/**
 * Created by ios on 16/11/21.
 */
public abstract class Product {
    //不管是什么产品,总能被生产出来
    public abstract void beProducted();

    //生产出来的东西,一定要销售出去,否则亏本
    public abstract void beSelled();

}
