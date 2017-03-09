package com.qf.chapter15.command.commandgroup;

/**
 * Created by ios on 16/10/31.
 */
public abstract class AbstractCommand {
    //把三个组都定义好,子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
