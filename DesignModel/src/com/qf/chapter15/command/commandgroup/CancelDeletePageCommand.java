package com.qf.chapter15.command.commandgroup;

/**
 * Created by ios on 16/10/31.
 */

/**
 * 撤销删除的页面,即回撤销操作
 */
public class CancelDeletePageCommand extends AbstractCommand {
    @Override
    public void execute() {
        super.pg.rollBack();
    }
}
