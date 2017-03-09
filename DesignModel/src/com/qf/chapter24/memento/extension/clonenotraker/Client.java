package com.qf.chapter24.memento.extension.clonenotraker;

/**
 * Created by ios on 16/11/15.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("初始状态...");

        System.out.println("初始状态是:" + originator.getState());

        //建立备份
        originator.createMemento();

        //修改状态
        originator.setState("修改后的状态...");
        System.out.println("修改后的状态是:"  + originator.getState());

        //恢复状态
        originator.restoreMemento();
        System.out.println("恢复后的状态是:" + originator.getState());
    }
}
