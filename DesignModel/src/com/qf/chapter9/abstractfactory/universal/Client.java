package com.qf.chapter9.abstractfactory.universal;

/**
 * Created by ios on 16/10/20.
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 在场景类中,没有任何一个方法与实现类有关系
         * 对于一个产品来说,我们只需要知道他的工厂方法,就可以直接产生一个产品对象,无须关心它的实现类
         */

        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        //产生A1对象
        AbstractProductA a1 = creator1.createProductA();
        AbstractProductA a2 = creator2.createProductA();

        AbstractProductB b1 = creator1.createProductB();
        AbstractProductB b2 = creator2.createProductB();
    }
}

