package com.qf.chapter15.command.commandgroup;

/**
 * Created by ios on 16/10/31.
 */
public class DeletePageCommand extends AbstractCommand {
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.rg.plan();
    }
}
