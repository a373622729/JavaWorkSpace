package com.qf.chapter12.proxy.extension.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by ios on 16/10/25.
 *
 * 动态代理,
 * 不需要创建代理类,也没有实现IGamePlayer接口
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");

        //定义一个Handler
        InvocationHandler handler = new GamePlayerIH(player);

        //获得类的classloader
        ClassLoader cl = player.getClass().getClassLoader();

        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,player.getClass().getInterfaces(),handler);
        proxy.login("zhangSan","password");
        proxy.killBoss();
        proxy.upgrade();
    }
}
