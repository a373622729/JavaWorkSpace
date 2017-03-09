package com.qf.chapter10.modelmethod.hummerextend;

/**
 * Created by ios on 16/10/21.
 */
//H1想响就响,
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;

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

    @Override
    protected boolean isArarm() {
        return alarmFlag;
    }

    //要不要响,由客户来决定
    public void setAlarm(boolean isAlarm) {
        alarmFlag = isAlarm;
    }
}
