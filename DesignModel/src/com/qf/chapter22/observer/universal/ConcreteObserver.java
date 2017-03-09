package com.qf.chapter22.observer.universal;

/**
 * Created by ios on 16/11/11.
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接受到消息,进行处理");
    }
}
