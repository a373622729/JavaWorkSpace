package com.qf.chapter12.proxy.extension.iproxy;


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

        //有了代练之后
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);

        System.out.println("开始时间是:2016-10-25 19:34:47");
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是:2016-10-25 19:35:23");
    }
}
