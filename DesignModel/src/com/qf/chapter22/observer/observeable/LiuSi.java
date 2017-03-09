package com.qf.chapter22.observer.observeable;

/**
 * Created by ios on 16/11/11.
 */
public class LiuSi implements Observer {
    @Override
    public void update(String context) {
        this.happy(context);
        System.out.println("刘思:乐死了..");
    }

    private void happy(String context) {
        System.out.println("刘思:因为" + context + ", --所以我快乐");
    }
}
