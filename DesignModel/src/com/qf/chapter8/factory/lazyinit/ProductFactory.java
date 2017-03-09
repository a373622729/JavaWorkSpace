package com.qf.chapter8.factory.lazyinit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ios on 16/10/19.
 * 懒加载,从工厂的缓存中取出需要的类的实例
 *
 * 用在对象初始化比较复杂的情况下,
 * 例如,硬盘访问,设计多方面的交互则可以通过延迟加载降低对象的产生和销毁带来的复杂性
 */
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<String, Product>();

    public static synchronized Product createProduct(String type) throws  Exception {
        Product product = null;
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new Product1();
            } else {
                product = new Product2();
            }
            prMap.put(type,product);
        }
        return product;
    }
}


abstract class Product {
    public void method1() {
        // TODO: 16/10/19
    }
    abstract void method2();
}

class Product1 extends Product {

    @Override
    void method2() {
        // TODO: 16/10/19
    }
}

class Product2 extends Product {

    @Override
    void method2() {
        // TODO: 16/10/19
    }
}
