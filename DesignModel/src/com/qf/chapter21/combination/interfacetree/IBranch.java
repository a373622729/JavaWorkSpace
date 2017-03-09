package com.qf.chapter21.combination.interfacetree;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/10.
 */
public interface IBranch extends ICorp {
    void addSubordinate(ICorp corp);

    ArrayList<ICorp> getSubordinate();
    //删除下属
    //void delSubordinate(ICorp corp);
}
