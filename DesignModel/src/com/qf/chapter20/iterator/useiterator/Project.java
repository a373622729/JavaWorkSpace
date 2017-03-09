package com.qf.chapter20.iterator.useiterator;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/9.
 */
public class Project implements IProject {
    //定义一个项目列表,所有的项目都放在这里
    private ArrayList<IProject> projects = new ArrayList<IProject>();
    private String name = "";
    private int num = 0;
    private int cost = 0;

    public Project() {

    }
    private Project(String name, int num, int cost) {
        this.name = name;
        this.num  = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projects.add(new Project(name,num,cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称是:" + this.name;
        info = info + "\t项目人数是:" + this.num;
        info = info + "\t项目费用是:" + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projects);
    }
}
