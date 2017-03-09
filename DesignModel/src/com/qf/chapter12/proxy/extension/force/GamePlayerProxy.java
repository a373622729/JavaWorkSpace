package com.qf.chapter12.proxy.extension.force;

/**
 * Created by ios on 16/10/25.
 */

/**
 * 游戏代练者
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }



    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    //代理的代理暂时还没有,返回自己
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
