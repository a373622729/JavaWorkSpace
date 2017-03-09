package com.qf.chapter25.visitor.employee;

/**
 * Created by ios on 16/11/16.
 */

/**
 * 普通员工
 */
public class CommonEmployee extends Employee {
    private String job;

    @Override
    protected String getOtherInfo() {
        return "工作:" + this.job + "\t";
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
