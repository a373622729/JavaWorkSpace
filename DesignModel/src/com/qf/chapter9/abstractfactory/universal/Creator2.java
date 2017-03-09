package com.qf.chapter9.abstractfactory.universal;

/**
 * Created by ios on 16/10/20.
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
