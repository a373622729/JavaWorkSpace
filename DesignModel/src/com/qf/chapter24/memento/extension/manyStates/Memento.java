package com.qf.chapter24.memento.extension.manyStates;

import java.util.HashMap;

/**
 * Created by ios on 16/11/15.
 */
public class Memento {
    //接受HashMap作为状态
    private HashMap<String, Object> stateMap;
    //接收一个对象,建立一个备份
    public Memento(HashMap<String, Object> map) {
        this.stateMap = map;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
