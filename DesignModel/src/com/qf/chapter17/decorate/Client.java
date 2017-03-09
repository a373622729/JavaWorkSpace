package com.qf.chapter17.decorate;

/**
 * Created by ios on 16/11/2.
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecoratorA(component);
        //第二次修饰
        component = new ConcreteDecoratorB(component);
        //修饰后运行
        component.operate();


    }
}
