package com.qf.chapter14.mediator.universal;

/**
 * Created by ios on 16/10/28.
 */
public class ConcreteColleague2 extends AbstractColleague {
    public ConcreteColleague2(AbstractMediator _mediator) {
        super(_mediator);
    }

    //自有方法
    public void selfMethod() {
        //自己可以处理的方法
    }

    //依赖方法,要依赖其他同事的方法,交给中介者去处理
    public void depMethod() {
        super.mediator.doSomething2();
    }
}
