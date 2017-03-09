package com.qf.chapter26.state.lift;

/**
 * Created by ios on 16/11/17.
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
