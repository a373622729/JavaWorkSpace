package com.qf.chapter20.iterator.noiterator;

/**
 * Created by ios on 16/11/9.
 */
public class Project implements IProject {

    private String name = "";
    private int num = 0;
    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称是:" + this.name;
        info = info + "\t项目人数是:" + this.num;
        info = info + "\t项目费用是:" + this.cost;
        return info;
    }
}
