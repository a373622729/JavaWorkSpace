package com.qf.chapter19.adapter.universal;

/**
 * Created by ios on 16/11/7.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.doSomething();
    }
}
