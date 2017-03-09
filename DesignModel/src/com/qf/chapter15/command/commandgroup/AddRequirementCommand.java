package com.qf.chapter15.command.commandgroup;

/**
 * Created by ios on 16/10/31.
 */

//增加需求的命令
    //需要什么命令,就创建一个类继承AbstractCommand
public class AddRequirementCommand extends AbstractCommand {
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
