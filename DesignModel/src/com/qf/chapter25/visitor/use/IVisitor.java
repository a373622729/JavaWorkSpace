package com.qf.chapter25.visitor.use;

/**
 * Created by ios on 16/11/16.
 */

/**
 * 如果打印出来的格式要改变,只需要再增加一个新的IVisitor的实现类就可以了.
 */

public interface IVisitor {
    //定义可以访问普通员工
    void visit(CommonEmployee commonEmployee);
    //定义可以访问部门经理
    void visit(Manager manager);
}
