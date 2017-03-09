package com.qf.chapter21.combination.abstracttree;

/**
 * Created by ios on 16/11/10.
 */
public abstract class ACorp {
    private String name = "";
    private String position = "";
    private int salary = 0;
    //父节点是谁
    private ACorp parent = null;

    public ACorp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "名称:" + this.name;
        info += "\t职位:" + this.position;
        info += "\t薪水:" + this.salary;
        return info;
    }

    //为了可以反向遍历
    protected void setParent(ACorp parent) {
        this.parent = parent;
    }

    public ACorp getParent() {
        return this.parent;
    }
}
