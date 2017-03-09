package com.qf.chapter14.mediator.universal;

/**
 * Created by ios on 16/10/28.
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
