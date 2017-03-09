package com.qf.chapter24.memento.extension.manyStates;

/**
 * Created by ios on 16/11/15.
 */
public class Client {
    /*
    public static void main(String[] args) {
        Originator ori = new Originator();
        Caretaker caretaker = new Caretaker();
        ori.setState1("中国");
        ori.setState2("强盛");
        ori.setState3("繁荣");
        System.out.println("===初始化状态===\n"+ori);

        caretaker.setMemento(ori.createMemento());
        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");
        System.out.println("===修改后状态===\n"+ori);

        ori.restoreMemento(caretaker.getMemento());
        System.out.println("===恢复后状态===\n"+ori);
    }
    */
    //多备份
    public static void main(String[] args) {
        Originator ori = new Originator();
        Caretaker caretaker = new Caretaker();
        ori.setState1("中国");
        ori.setState2("强盛");
        ori.setState3("繁荣");
        System.out.println("===初始化状态===\n"+ori);

        caretaker.setMemento("001",ori.createMemento());
        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");
        System.out.println("===修改后状态===\n"+ori);

        caretaker.setMemento("002",ori.createMemento());
        ori.setState1("苹果");
        ori.setState2("橘子");
        ori.setState3("香蕉");
        System.out.println("===修改后状态===\n"+ori);

        ori.restoreMemento(caretaker.getMemento("001"));
        System.out.println("===恢复后状态===\n"+ori);
    }
}
