package com.qf.chapter25.visitor.extension.count;

import com.qf.chapter25.visitor.use.CommonEmployee;
import com.qf.chapter25.visitor.use.Manager;

/**
 * Created by ios on 16/11/16.
 */

/**
 * 统计总工资,根据不同系数算出各自的.
 */
public class Visitor implements IVisitor {
    //部门经理工资系数是5
    private static final int MANAGER_COEFFICIENT = 5;
    //员工的是2
    private static final int COMMONEMPLOYEE_COEFFICIENT = 2;
    private int commonTotalSalary = 0;
    private int managerTotalSalary = 0;

    private void calManagerSalary(int salary) {
        this.managerTotalSalary += salary * MANAGER_COEFFICIENT;
    }

    private void calCommonSalary(int salary) {
        this.commonTotalSalary += salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        calCommonSalary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        calManagerSalary(manager.getSalary());
    }

    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }
}
