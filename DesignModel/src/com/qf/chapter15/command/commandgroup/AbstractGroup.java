package com.qf.chapter15.command.commandgroup;

/**
 * Created by ios on 16/10/31.
 */
public abstract class AbstractGroup {
    /**
     * 这些方法,会发现,他们都是命令,都是一个命令语气
     */
    //甲乙双方分开办公,如果要和某个讨论路你要先找到这个组
    public abstract void find();
    //增加功能
    public abstract void add();
    public abstract void delete();
    public abstract void change();
    //给出所有的变更计划
    public abstract void plan();

    //每个接受者都需要对直接执行的任务可以回滚
    public void rollBack() {
        //根据日志进行回滚,根据事务日志进行回滚
    }
}
