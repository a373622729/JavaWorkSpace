package com.qf.chapter25.visitor.employee;

/**
 * Created by ios on 16/11/16.
 */
public abstract class Employee {
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private String name;
    private int salary;
    private int sex;

    //打印员工的信息,模板方法
    public final void report() {
        String info = "姓名:" + this.name + "\t";
        info += "性别:" + (this.sex == FEMALE ? "女" : "男") + "\t";
        info += "薪水:" + this.salary + "\t";
        //获得员工其他信息
        info += this.getOtherInfo();
        System.out.println(info);
    }

    //拼装员工的其他信息
    //由子类进行扩展,用protected
    protected abstract String getOtherInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
