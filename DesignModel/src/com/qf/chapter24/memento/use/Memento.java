package com.qf.chapter24.memento.use;

/**
 * Created by ios on 16/11/15.
 */
public class Memento {
    private String state = "";

    public Memento(String _state) {
        this.state = _state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
