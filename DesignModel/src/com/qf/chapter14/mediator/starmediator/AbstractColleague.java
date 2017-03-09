package com.qf.chapter14.mediator.starmediator;

/**
 * Created by ios on 16/10/28.
 */

/**
 * 抽象同事类
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
