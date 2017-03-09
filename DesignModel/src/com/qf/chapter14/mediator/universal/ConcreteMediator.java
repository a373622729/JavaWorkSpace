package com.qf.chapter14.mediator.universal;

/**
 * Created by ios on 16/10/28.
 */
public class ConcreteMediator extends AbstractMediator {

    //调用同事类的方法,只要是public都可以用
    @Override
    public void doSomething1() {
        super.c1.selfMethod();
        super.c2.selfMethod();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod();
        super.c2.selfMethod();
    }
}
