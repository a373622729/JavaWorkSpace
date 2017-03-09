package com.qf.chapter21.combination.abstracttree;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/10.
 */
public class Branch extends ACorp {

    private ArrayList<ACorp> subordinateList = new ArrayList<ACorp>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public ArrayList<ACorp> getSubordinateList() {
        return subordinateList;
    }

    public void addSubordinate(ACorp corp) {
        this.subordinateList.add(corp);
        //给子节点设置父节点
        corp.setParent(this);
    }
}
