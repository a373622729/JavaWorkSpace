package com.qf.chapter12.proxy.extension.dynamic.universal;

/**
 * Created by ios on 16/10/26.
 */
//要切入的类
public interface IAdvice {
    //通知只有一个方法,执行即可
    void exec();
}
