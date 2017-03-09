package com.qf.chapter11.builder.universal;

/**
 * Created by ios on 16/10/24.
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
