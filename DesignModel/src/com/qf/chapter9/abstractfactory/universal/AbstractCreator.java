package com.qf.chapter9.abstractfactory.universal;

/**
 * Created by ios on 16/10/20.
 */
public abstract class AbstractCreator {
    //有N个产品族,工厂中就有N个创建方法
    //有M个产品等级,就要有M个实现工厂类
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
