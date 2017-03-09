package com.qf.chapter24.memento.use;

/**
 * Created by ios on 16/11/15.
 */

/**
 * 备忘录管理者
 */
//caretraker  看门人
public class Caretraker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
