package com.qf.chapter14.mediator.universal;

/**
 * Created by ios on 16/10/28.
 */
public class ConcreteColleague1 extends AbstractColleague{

    public ConcreteColleague1(AbstractMediator _mediator) {
        super(_mediator);
    }
    //自有方法
    public void selfMethod() {
        //处理自己的业务逻辑
    }
    //依赖方法
    public void depMethod() {
        //自己不能处理的,让中介者处理
        super.mediator.doSomething1();
    }
}
