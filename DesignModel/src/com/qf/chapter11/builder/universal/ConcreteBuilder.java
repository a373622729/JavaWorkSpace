package com.qf.chapter11.builder.universal;

/**
 * Created by ios on 16/10/24.
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    //设置产品零件
    @Override
    public void setPart() {
        //// TODO: 16/10/24
        product.setPart();
    }

    @Override
    public Product buildProduct() {
        return product ;
    }
}
