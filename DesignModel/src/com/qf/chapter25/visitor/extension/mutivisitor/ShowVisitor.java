package com.qf.chapter25.visitor.extension.mutivisitor;

import com.qf.chapter25.visitor.use.CommonEmployee;
import com.qf.chapter25.visitor.use.Employee;
import com.qf.chapter25.visitor.use.Manager;

/**
 * Created by ios on 16/11/16.
 */
public class ShowVisitor implements IShowVisitor {
    private String info = "";
    @Override
    public void report() {
        System.out.println(this.info);
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info = getCommonEmployeeInfo(commonEmployee);
    }

    @Override
    public void visit(Manager manager) {
        this.info = getManagerInfo(manager);
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名:" + employee.getName() + "\t";
        info += "性别:" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info += "薪水:" + employee.getSalary() + "\t";
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩:" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作:" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
