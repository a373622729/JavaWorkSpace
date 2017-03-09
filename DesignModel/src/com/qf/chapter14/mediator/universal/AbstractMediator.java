package com.qf.chapter14.mediator.universal;

/**
 * Created by ios on 16/10/28.
 */

/**
 * 为什么同事类要使用构造函数注入中介者,而中介者使用getter/setter方式注入同事类?
 * 因为同事类必须有中介者,而中介者却可以只有部分同事类.
 */
public abstract class AbstractMediator {
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;

    public ConcreteColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }
    //中介者模式的业务逻辑
    public abstract void doSomething1();
    public abstract void doSomething2();
}
