package com.qf.chapter25.visitor.use;

/**
 * Created by ios on 16/11/16.
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
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
