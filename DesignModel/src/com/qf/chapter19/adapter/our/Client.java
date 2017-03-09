package com.qf.chapter19.adapter.our;

/**
 * Created by ios on 16/11/7.
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        for (int i = 0;i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
