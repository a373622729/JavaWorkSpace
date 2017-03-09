package com.qf.chapter15.command.commandgroup;

/**
 * Created by ios on 16/10/31.
 */

/**
 * 负责人
 */
public class Invoker {
    //什么命令
    private AbstractCommand command;
    //客户发出的命令
    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    //执行客户的命令
    public void action() {
        this.command.execute();
    }
}
