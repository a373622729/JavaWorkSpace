package com.qf.chapter25.visitor.employee;

/**
 * Created by ios on 16/11/16.
 */

/**
 * 管理层
 */
public class Manager extends Employee {
    //业绩
    private String performance;

    @Override
    protected String getOtherInfo() {
        return "业绩:" + this.performance + "\t";
    }

    //getter/setter

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
