package com.qf.chapter26.state.liftstate;

/**
 * Created by ios on 16/11/17.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
