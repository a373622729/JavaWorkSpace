package com.qf.chapter10.modelmethod.hummer;

/**
 * Created by ios on 16/10/21.
 */

//具体模板
public class HummerH1Model extends HummerModel {

    @Override
    protected void start() {
        System.out.println("悍马H1start...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1stop...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1alarm...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1engineBoom...");
    }

//    @Override
//    public void run() {
//        //System.out.println("悍马H1run...");
//        start();
//        engineBoom();
//        alarm();
//        stop();
//    }
}
