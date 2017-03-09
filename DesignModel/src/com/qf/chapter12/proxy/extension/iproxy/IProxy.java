package com.qf.chapter12.proxy.extension.iproxy;

/**
 * Created by ios on 16/10/25.
 */

/**
 * 代理类可以为真实角色预处理消息,过滤消息,消息转发.时候处理消息等功能
 * 可以代理多个真实角色,并且真实角色之间可以有耦合关系
 */

public interface IProxy {
    //费用计算
    void count();
}
