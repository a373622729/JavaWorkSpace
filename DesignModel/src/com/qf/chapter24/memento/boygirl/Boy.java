package com.qf.chapter24.memento.boygirl;

/**
 * Created by ios on 16/11/15.
 */
public class Boy {
    //男孩的状态
    private String state = "";

    public void changeState() {
        this.state = "心情很不好";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
