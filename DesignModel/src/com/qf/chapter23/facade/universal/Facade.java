package com.qf.chapter23.facade.universal;

import com.qf.chapter23.facade.universal.extend.Context;

/**
 * Created by ios on 16/11/14.
 */
public class Facade {
    //被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    private Context context = new Context();

    //提供给外部访问的方法
    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        //this.c.doSomethingC();
        this.context.complexMethod();
    }
}
