package com.qf.chapter20.iterator.useiterator;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/9.
 */
public class ProjectIterator implements IProjectIterator {
    //所有的项目都被放在这里面
    private ArrayList<IProject> projects = new ArrayList<IProject>();
    private int currentItem = 0;

    //构造函数传入projectList
    public ProjectIterator(ArrayList<IProject> projects) {
        this.projects = projects;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem == this.projects.size() || this.projects.get(currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public Object next() {
        return this.projects.get(currentItem++);
    }
}
