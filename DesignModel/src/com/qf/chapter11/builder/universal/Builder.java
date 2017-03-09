package com.qf.chapter11.builder.universal;

/**
 * Created by ios on 16/10/24.
 */
public abstract class Builder {
    //设置产品的不同部分,以获得不同的产品,比如执行顺序,颜色,等等
    public abstract void setPart();

    public abstract Product buildProduct();
}
