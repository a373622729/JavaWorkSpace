package com.qf.chapter12.proxy.extension.force;

/**
 * Created by ios on 16/10/25.
 */
public interface IGamePlayer {
    void login(String user, String password);
    void killBoss();
    void upgrade();

    //每个人都可以找一下自己的代理
    IGamePlayer getProxy();
}
