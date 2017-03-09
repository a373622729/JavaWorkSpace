package com.qf.chapter29.bridge.use;

/**
 * Created by ios on 16/11/21.
 */
public class ShanZhaiCorp extends Corp {

    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱...");
    }
}
