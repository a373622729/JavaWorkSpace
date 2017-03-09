package com.qf.chapter24.memento.extension.clonememento;

/**
 * Created by ios on 16/11/15.
 */

/**
 * Originator 即是发起者,也是备忘录
 */

public class Originator implements Cloneable {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Originator createMemento() {
        return this.clone();
    }

    public void restoreMemento(Originator _originator) {
        this.setState(_originator.getState());
    }

    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
