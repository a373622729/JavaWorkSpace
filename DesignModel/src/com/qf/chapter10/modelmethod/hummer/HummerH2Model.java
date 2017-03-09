package com.qf.chapter10.modelmethod.hummer;

/**
 * Created by ios on 16/10/21.
 */

//具体模板
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H2start...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2stop...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2alarm...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2engineBoom...");
    }

    /**
     * 两个实现类里面run()方法里的代码完全相同,所以应该出现在抽象类中
     * 如果相同一段代码复制过2次,那么就需要对设计产生怀疑
     */
//    @Override
//    public void run() {
//        //System.out.println("悍马H2run...");
//        start();
//        engineBoom();
//        alarm();
//        stop();
//    }
}
