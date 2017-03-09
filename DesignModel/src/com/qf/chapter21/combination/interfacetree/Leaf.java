package com.qf.chapter21.combination.interfacetree;

/**
 * Created by ios on 16/11/10.
 */
public class Leaf implements ILeaf {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称:" + this.name;
        info += "\t职位:" + this.position;
        info += "\t薪水:" + this.salary;
        return info;
    }
}
