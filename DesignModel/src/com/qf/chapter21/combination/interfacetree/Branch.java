package com.qf.chapter21.combination.interfacetree;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/10.
 */
public class Branch implements IBranch {
    private String name = "";
    private String position = "";
    private int salary = 0;

    private ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }



    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
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
