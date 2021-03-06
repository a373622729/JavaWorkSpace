package com.qf.chapter12.proxy.extension.force;

/**
 * Created by ios on 16/10/25.
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    /****///我的代理是谁
    private IGamePlayer proxy = null;

    //通过构造函数传递名称
    public GamePlayer(String _name) {
        this.name = _name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功!");
        } else {
            System.out.println("请使用代理访问");
        }

    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪");
        } else {
            System.out.println("请使用代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "又升了一级");
        } else {
            System.out.println("请使用代理访问");
        }
    }
    //找到自己的代理
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    //校验是否是代理访问,检查是否是自己指定的代理,是指定的代理则允许访问,否则不允许访问
    private boolean isProxy() {
        if (this.proxy == null ) {
            return false;
        } else {
            return true;
        }
    }
}
