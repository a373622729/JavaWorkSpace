package com.qf.chapter18.policy.strategy;

/**
 * Created by ios on 16/11/4.
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("---刚刚到吴国的时候拆一个---");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("---刘备乐不思蜀了,拆第二个---");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("---孙权追兵来了,拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
