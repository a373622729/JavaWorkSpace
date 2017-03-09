package com.qf.chapter25.visitor.use;

/**
 * Created by ios on 16/11/16.
 */

/**
 * 管理层
 */
public class Manager extends Employee {
    //业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
