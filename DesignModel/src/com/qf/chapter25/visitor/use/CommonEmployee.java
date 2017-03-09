package com.qf.chapter25.visitor.use;

/**
 * Created by ios on 16/11/16.
 */

/**
 * 普通员工
 */
public class CommonEmployee extends Employee {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
