package com.qf.chapter26.state.lift;

/**
 * Created by ios on 16/11/17.
 */
public interface ILift {
    //电梯门的状态
    public static final int OPENING_STATE = 1;
    public static final int CLOSEING_STATE = 2;
    public static final int RUNNING_STATE = 3;
    public static final int STOPPING_STATE = 4;

    public void setState(int state);

    void open();
    void close();
    void run();
    void stop();
}
