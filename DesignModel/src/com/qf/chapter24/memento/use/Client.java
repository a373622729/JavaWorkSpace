package com.qf.chapter24.memento.use;

/**
 * Created by ios on 16/11/15.
 */

/**
 * 对高层来说,他们不想去关心到底有没有备忘录这个类,只想创建一个备份点,在需要的时候再恢复到这个点就好,所以再封装一层,增加一个 备忘录管理类
 */

public class Client {
//    public static void main(String[] args) {
//        Boy boy = new Boy();
//
//        boy.setState("心情很棒!");
//        System.out.println("---现在的状态----");
//        System.out.println(boy.getState());
//        //记录当前状态
//        Memento memento = boy.createMemento();
//
//        boy.changeState();
//        System.out.println("---追女孩后状态---");
//        System.out.println(boy.getState());
//        //追女孩失败,恢复
//        boy.restoreMemento(memento);
//        System.out.println("---恢复后状态---");
//        System.out.println(boy.getState());
//    }
    /**
     * 增加了备忘录管理类
     */
    public static void main(String[] args) {
        Boy boy = new Boy();
        Caretraker caretraker = new Caretraker();

        boy.setState("心情很棒");
        System.out.println("---现在的状态----");
        System.out.println(boy.getState());

        caretraker.setMemento(boy.createMemento());
        boy.changeState();
        System.out.println("---追女孩后状态---");
        System.out.println(boy.getState());

        boy.restoreMemento(caretraker.getMemento());
        System.out.println("---恢复后状态---");
        System.out.println(boy.getState());
    }
}
