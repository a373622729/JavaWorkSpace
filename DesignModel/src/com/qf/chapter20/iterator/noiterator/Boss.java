package com.qf.chapter20.iterator.noiterator;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/9.
 */
public class Boss {
    public static void main(String[] args) {
        ArrayList<IProject> projectList = new ArrayList<IProject>();
        projectList.add(new Project("星球大战项目",10,100000));
        projectList.add(new Project("扭转时空项目",100,100000));
        projectList.add(new Project("超人改造项目",10000,1000000));

        for (int i = 0; i < 104; i++) {
            projectList.add(new Project("第"+i+"个项目",i*5,i*100000));
        }

        for (IProject project : projectList) {
            System.out.println(project.getProjectInfo());
        }
    }
}
