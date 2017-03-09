package com.qf.chapter26.state.liftstate;

/**
 * Created by ios on 16/11/17.
 */
public abstract class LiftState {
    //定义一个环境角色,也就是封装状态的变化引起的功能变化
    protected Context context;
    public void setContext(Context _context) {
        this.context = _context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
