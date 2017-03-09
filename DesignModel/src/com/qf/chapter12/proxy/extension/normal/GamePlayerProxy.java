package com.qf.chapter12.proxy.extension.normal;

/**
 * Created by ios on 16/10/25.
 */

/**
 * 仅仅修改了构造函数,传递进来一个代理者名称,即可进行代理,在这种改造下,系统更加简洁了
 * 调用者,只需要知道代理存在就可以,不用知道代理了谁
 */

/**
 * 游戏代练者
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

//    public GamePlayerProxy(IGamePlayer _gamePlayer) {
//        this.gamePlayer = _gamePlayer;
//    }

    /**
     * 普通代理模式更改的地方
     */
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            // TODO: 16/10/25 异常处理
        }
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
}
