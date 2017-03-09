package com.qf.chapter8.factory.nvwa;

/**
 * Created by ios on 16/10/19.
 */
public abstract class AbstractHumanFactory {
    //约束其输入参数的类型

    /**
     *
     * @param 必须是Class类型
     * @param 必须是human的实现类
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> c);
}
