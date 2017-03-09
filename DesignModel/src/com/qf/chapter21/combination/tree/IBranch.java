package com.qf.chapter21.combination.tree;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/10.
 */
public interface IBranch {
    String getInfo();

    void add(IBranch barnch);

    void add(ILeaf leaf);

    ArrayList getSubordinateInfo();
}
