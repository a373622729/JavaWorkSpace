package com.qf.chapter8.factory.universal;

/**
 * Created by ios on 16/10/19.
 */
public class Client {
    public static void main(String[] args) {
        AbstractCreator creator = new ConcreteCreator();
        AbstractProduct product = creator.createProduct(ConcreteProduct1.class);
    }
}
