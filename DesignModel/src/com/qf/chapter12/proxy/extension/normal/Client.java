package com.qf.chapter12.proxy.extension.normal;

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
//        IGamePlayer player = new GamePlayer("张三");
//        IGamePlayer proxy = new GamePlayerProxy(player);
//
//        System.out.println("开始时间是:2016-10-25 19:34:47");
//        proxy.login("zhangSan", "password");
//        proxy.killBoss();
//        proxy.upgrade();
//        System.out.println("结束时间是:2016-10-25 19:35:23");

        //普通代理模式,不知道真实角色,只知道代理角色
        /**
         * 在真实的项目中一般都通过约定来禁止new一个真实的角色
         */
        IGamePlayer proxy = new GamePlayerProxy("张三");
        System.out.println("开始时间");
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间");
    }
}
