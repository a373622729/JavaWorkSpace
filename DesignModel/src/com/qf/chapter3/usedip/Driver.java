package com.qf.chapter3.usedip;

/**
 * Created by ios on 16/10/12.
 */
public class Driver implements IDriver {

    public void drive(ICar car) {
        car.run();
    }
}