package com.qf.chapter15.command.commandgroup;

/**
 * Created by ios on 16/10/31.
 */
public class Client {
    public static void main(String[] args) {
        //定义接头人,负责人
        Invoker xiaoSan = new Invoker();
       // System.out.println("------客户要求增加一项需求------");
       // AbstractCommand command = new AddRequirementCommand();
        AbstractCommand command = new DeletePageCommand();  //删除一个页面,只要修改这一句代码就够
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}
