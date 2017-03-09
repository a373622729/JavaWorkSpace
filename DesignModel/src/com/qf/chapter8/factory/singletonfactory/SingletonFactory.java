package com.qf.chapter8.factory.singletonfactory;

import java.lang.reflect.Constructor;

/**
 * Created by ios on 16/10/19.
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            //获得单例模式的类
            Class c1 = Class.forName((Singleton.class.getName()));
            //获得无参构造函数
            Constructor constructor = c1.getDeclaredConstructor();
            //设置无参构造函数可访问
            constructor.setAccessible(true);

            singleton = (Singleton)constructor.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
