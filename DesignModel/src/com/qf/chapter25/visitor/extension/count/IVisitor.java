package com.qf.chapter25.visitor.extension.count;

import com.qf.chapter25.visitor.use.CommonEmployee;
import com.qf.chapter25.visitor.use.Manager;

/**
 * Created by ios on 16/11/16.
 */
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);
    void visit(Manager manager);

    //统计所有员工工资总和
    public int getTotalSalary();
}
