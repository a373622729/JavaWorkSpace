package com.qf.chapter22.observer.observeable;

/**
 * Created by ios on 16/11/11.
 */
public class WangSi implements Observer {
    @Override
    public void update(String context) {
        this.cry(context);
        System.out.println("王思:哭死了...");

    }

    private void cry(String context) {
        System.out.println("王思:因为" + context + ", -- 所以悲伤");
    }
}
