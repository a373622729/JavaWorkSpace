package com.qf.chapter8.factory.universal;

/**
 * Created by ios on 16/10/19.
 */
public class ConcreteCreator extends AbstractCreator {
    @Override
    public <T extends AbstractProduct> T createProduct(Class<T> tClass) {
        AbstractProduct product = null;

        try {
            product = tClass.newInstance();
        } catch (Exception e) {
            System.out.println("创建产品异常");
        }
        return (T)product;
    }
}
