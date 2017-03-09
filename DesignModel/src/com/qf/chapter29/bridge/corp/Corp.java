package com.qf.chapter29.bridge.corp;

/**
 * Created by ios on 16/11/21.
 */
public abstract class Corp {
    protected abstract void produce();
    protected abstract void sell();

    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
