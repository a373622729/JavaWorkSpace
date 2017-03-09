package com.qf.chapter17.decorate;

/**
 * Created by ios on 16/11/2.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component _component) {
        super(_component);
    }

    //定义自己的修饰方法
    private void method2() {
        System.out.println("method2 修饰");
    }

    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
