package com.qf.chapter11.builder.car;

import java.util.ArrayList;

/**
 * Created by ios on 16/10/24.
 */
public abstract class CarModel {
    //各个方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i=0;i < this.sequence.size();i++) {
            String actionName = sequence.get(i);
            if (actionName.equals("start")) {
                start();
            } else if (actionName.equals("stop")) {
                stop();
            } else if (actionName.equals("alarm")) {
                alarm();
            } else if (actionName.equals("engineBoom")) {
                engineBoom();
            }
        }
    }
    //把传递过来的值传递到类内
    final public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
