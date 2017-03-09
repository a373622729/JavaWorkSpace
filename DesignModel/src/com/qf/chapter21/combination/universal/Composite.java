package com.qf.chapter21.combination.universal;

import java.util.ArrayList;

/**
 * Created by ios on 16/11/10.
 */
//复合物 - composite
public class Composite extends AComponent{
    private ArrayList<AComponent> components = new ArrayList<AComponent>();

    public void add(AComponent component) {
        this.components.add(component);
    }

    public void remove(AComponent component) {
        this.components.remove(component);
    }

    public ArrayList<AComponent> getChildren() {
        return this.components;
    }
}
