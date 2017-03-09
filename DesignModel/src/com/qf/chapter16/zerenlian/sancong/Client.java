package com.qf.chapter16.zerenlian.sancong;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ios on 16/11/1.
 */

/**
 * 代码存在以下问题
 * 1.职责界定不清晰,Father类应该是知道女儿的请求自己处理,而不是在Client中进行组装出来
 * 2.代码臃肿, if...else的判断条件,会越来越多
 * 3.耦合过重,需要通过Women的type来决定使用哪个IHandler,违背了开闭原则
 * 4.异常情况欠考虑
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
        }

        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                father.handleMessage(women);
            } else if (women.getType() == 2) {
                husband.handleMessage(women);
            } else if (women.getType() == 3) {
                son.handleMessage(women);
            } else { }
        }
    }
}
