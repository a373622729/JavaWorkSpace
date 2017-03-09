package com.qf.chapter24.memento.extension.manyStates;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ios on 16/11/15.
 */
public class Caretaker {
    //多备份
    private Map<String, Memento> memMap = new HashMap<String, Memento>();

    public Memento getMemento(String index) {
        return memMap.get(index);
    }

    public void setMemento(String index, Memento memento) {
        this.memMap.put(index, memento);
    }
/**
 * 单备份
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
    */
}
