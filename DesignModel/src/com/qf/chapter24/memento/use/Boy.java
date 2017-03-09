package com.qf.chapter24.memento.use;

/**
 * Created by ios on 16/11/15.
 */
public class Boy {
    private String state = "";

    public void changeState() {
        this.state = "心情很不好";
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //保留一个备份
    public Memento createMemento() {
        return new Memento(this.state);
    }

    //恢复一个备份
    public void restoreMemento(Memento _memento) {
        this.setState(_memento.getState());
    }
}
