package com.qf.chapter17.decorate;

/**
 * Created by ios on 16/11/2.
 */
public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component _component) {
        this.component = _component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
