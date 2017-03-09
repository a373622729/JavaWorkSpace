package com.qf.chapter16.zerenlian.chain;

/**
 * Created by ios on 16/11/1.
 */

import java.util.ArrayList;
import java.util.Random;

/**
 * 业务类不需要去判断,到底是谁要去处理,只需要设置好请求的顺序即可
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> womens = new ArrayList<IWomen>();

        for (int i = 0; i < 5; i++) {
            womens.add(new Women(random.nextInt(4),"我要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : womens) {
            father.handleMessage(women);
        }
    }
}
