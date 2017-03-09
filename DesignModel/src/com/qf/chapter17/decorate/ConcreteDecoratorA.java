package com.qf.chapter17.decorate;

/**
 * Created by ios on 16/11/2.
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component _component) {
        super(_component);
    }

    //自己的修饰方法
    private void method1() {
        System.out.println("method1 修饰");
    }

    //重写父类的方法
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
