package com.qf.chapter12.proxy.extension.force;

/**
 * Created by ios on 16/10/25.
 */
public class Client {
    public static void main(String[] args) {
        //没有代练之前
//        IGamePlayer player = new GamePlayer("张三");
//
//        System.out.println("开始时间是: 2016-10-25 19:27:54");
//        player.login("zhang San", "password");
//        player.killBoss();
//        player.upgrade();
//        System.out.println("结束时间是:2016-10-25 19:28:42");

//        IGamePlayer player = new GamePlayer("张三");
//        player.login("zhangSan","password");
//        player.killBoss();
//        player.upgrade();
//        //结果需要调用代理访问
//
//        IGamePlayer player1 = new GamePlayer("张三");
//        IGamePlayer proxy = new GamePlayerProxy(player1);
//        proxy.login("zhangSan","password");
//        proxy.killBoss();
//        proxy.upgrade();
//        //也不能访问

        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        proxy.login("zhangSan","password");
        proxy.killBoss();
        proxy.upgrade();

    }
}
