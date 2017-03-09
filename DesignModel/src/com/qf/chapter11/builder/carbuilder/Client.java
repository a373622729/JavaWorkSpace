package com.qf.chapter11.builder.carbuilder;

/**
 * Created by ios on 16/10/24.
 */
public class Client {
    public static void main(String[] args) {
//        ArrayList<String> sequence = new ArrayList<String>();
//
//        sequence.add("engineBoom");
//        sequence.add("start");
//        sequence.add("stop");
//
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//
//        BenzModel benz =(BenzModel) benzBuilder.getCarModel();

        Director director = new Director();
        for (int i = 0; i < 1000; i++) {
            director.getABenzModel().run();
        }
    }
}
