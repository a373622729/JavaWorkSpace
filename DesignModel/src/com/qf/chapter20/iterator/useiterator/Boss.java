package com.qf.chapter20.iterator.useiterator;

/**
 * Created by ios on 16/11/9.
 */
public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战项目ddd",10,10000);
        project.add("扭转时空项目",100,1000000);

        for (int i = 0; i < 104; i++) {
            project.add("第" + i + "个项目",i*5,i*100000);
        }

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
           IProject project1 = (IProject) projectIterator.next();
            System.out.println(project1.getProjectInfo());
        }
    }
}
