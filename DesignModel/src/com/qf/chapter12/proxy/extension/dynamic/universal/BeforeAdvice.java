package com.qf.chapter12.proxy.extension.dynamic.universal;

/**
 * Created by ios on 16/10/26.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知,我被执行了!");
    }
}
