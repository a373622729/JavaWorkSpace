package com.qf.chapter21.combination.abstracttree;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/10.
 */
public class Client {
    //遍历整棵树,只要给出根节点
    public static String getTreeInfo(Branch root) {
        ArrayList<ACorp> subordinateList = root.getSubordinateList();

        String info = "";
        for (ACorp s : subordinateList) {
            if (s instanceof Leaf) {
                info = info + s.getInfo() + "\n";
            } else {
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch)s);
            }
        }
        return info;
    }

    public static void main(String[] args) {
        Branch root = new Branch("Root","A",1);
        Branch branch1 = new Branch("Branch1","B",2);
        Branch branch2 = new Branch("Branch2","C",3);
        Leaf leaf1 = new Leaf("Leaf1","D",4);
        Leaf leaf2 = new Leaf("Leaf2","E",5);
        root.addSubordinate(branch1);
        root.addSubordinate(branch2);
        branch1.addSubordinate(leaf1);
        branch1.addSubordinate(leaf2);

        System.out.println(getTreeInfo(root));
    }
}
