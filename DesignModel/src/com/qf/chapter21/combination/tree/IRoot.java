package com.qf.chapter21.combination.tree;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/10.
 */
public interface IRoot {
    //得到总经理的信息
    String getInfo();
    //增加树枝
    void add(IBranch branch);
    //增加叶子
    void add(ILeaf leaf);
    //获得 低级别的员工信息
    ArrayList getSubordinateInfo();
}
