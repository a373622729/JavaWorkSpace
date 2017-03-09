package com.qf.chapter9.abstractfactory.universal;

/**
 * Created by ios on 16/10/20.
 */

public class Creator1 extends AbstractCreator {
    /**
     * 有M个产品等级,就要有M个实现工厂类
     * @return
     */

    //只生产产品等级为1的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    //只生产产品等级为1的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
