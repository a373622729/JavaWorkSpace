package com.qf.chapter11.builder.car;

import java.util.ArrayList;

/**
 * Created by ios on 16/10/24.
 */
public class Client {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
        benz.setSequence(sequence);
        benz.run();
    }
}
