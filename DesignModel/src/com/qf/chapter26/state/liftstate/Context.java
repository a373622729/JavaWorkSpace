package com.qf.chapter26.state.liftstate;

/**
 * Created by ios on 16/11/17.
 */

/**
 * 是一个环境类,作用是串联各个状态的过度.
 * 有两个不成文的约束:
 * 1.把状态对象声明为静态常量,有几个状态对象,就声明几个静态常量
 * 2.环境角色具有状态抽象角色定义的所有行为,具体行为使用委托方式.
 */

public class Context {
    //定义出电梯所有状态
    public static final OpenningState openningState = new OpenningState();
    public static final ClosingState closingState = new ClosingState();
    public static final RunningState runningState = new RunningState();
    public static final StoppingState stoppingState = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return this.liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //把当前的环境通知到各个实现类中
        /*********** important *************/
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

}
