package com.qf.chapter24.memento.extension.clonenotraker;


/**
 * 不需要Caretraker,自主备份和恢复
 *
 * 适用于简单的场景, 因为会涉及到深拷贝和浅拷贝的问题, 有时候会很复杂
 */

public class Originator implements Cloneable {
    private String state = "";

    private Originator backup;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento() {
        this.backup = this.clone();
    }

    public void restoreMemento() {
        assert this.backup != null;
        this.setState(this.backup.getState());
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