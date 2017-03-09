package com.qf.chapter24.memento.boygirl;

/**
 * Created by ios on 16/11/15.
 */

/**
 * 一个状态的保存和改变,不应该由高层模块来负责,应该在Boy类内部实现
 */
public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();

        boy.setState("心情很好");

        System.out.println(boy.getState());

        Boy backup = new Boy();
        backup.setState(boy.getState());
        //追女孩后的状态
        boy.changeState();

        System.out.println(boy.getState());
        //恢复状态
        boy.setState(backup.getState());
        System.out.println(boy.getState());
    }
}
