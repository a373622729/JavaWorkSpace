package com.qf.chapter23.facade.universal.extend;

/**
 * Created by ios on 16/11/14.
 */

import com.qf.chapter23.facade.universal.Facade;

/**
 * 增加一个新的门面,提供给另一个高层模块使用
 */

public class Facade2 {
    //委托给原来的门面,保证相同的代码只编写一次
    private Facade facade = new Facade();
    //对外提供唯一访问子系统的方法
    public void methodB() {
        this.facade.methodB();
    }
}
