package com.qf.chapter19.adapter.outer;

import com.qf.chapter19.adapter.our.IUserInfo;
import com.qf.chapter19.adapter.our.OuterUserInfo;

/**
 * Created by ios on 16/11/7.
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo youngGirl = new OuterUserInfo();
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
