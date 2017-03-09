package com.qf.chapter11.builder.carbuilder.model;

/**
 * Created by ios on 16/10/24.
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰start...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰stop...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰alarm...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰engineBoom...");
    }
}
