package com.qf.chapter29.bridge.use;

/**
 * Created by ios on 16/11/21.
 */
public class HouseCorp extends Corp {
    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
