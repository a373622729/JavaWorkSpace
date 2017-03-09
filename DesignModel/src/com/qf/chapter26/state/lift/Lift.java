package com.qf.chapter26.state.lift;

/**
 * Created by ios on 16/11/17.
 */

/**
 * 电梯在不同状态可以执行的操作是不一样的
 *
 * 这个类,扩展难,维护不方便
 */

public class Lift implements ILift {
    private int state;


    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSEING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSEING_STATE);
                break;
            case CLOSEING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSEING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSEING_STATE:
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }


    private void openWithoutLogic() {
        System.out.println("电梯门开启...");
    }


    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }


    private void runWithoutLogic() {
        System.out.println("电梯运行起来...");
    }

    private void stopWithoutLogic() {
        System.out.println("电梯停止..");
    }
}
