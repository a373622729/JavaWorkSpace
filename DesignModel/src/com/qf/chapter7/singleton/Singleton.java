package com.qf.chapter7.singleton;

/**
 * Created by ios on 16/10/17.
 * 单例模式
 *
 * 使用场景:
 * 1.需要生成唯一序列号环境
 * 2.在整个项目中需要一个共享访问点,或共享数据,要确保线程安全
 * 3.创建一个对象需要消耗资源过多,如访问IO,和数据库等
 * 4.需要定义大量的静态常亮和静态方法
 *
 * 单例不要实现Cloneable接口,这样就不会被clone
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() { }

    public static Singleton getSingleton() {
        return  singleton;
    }

    //类中其他方法,尽量是static
    public static void doSomething() {

    }
}

class Singleton2 {
    private static Singleton2 singleton = null;

    private Singleton2() { }

    synchronized
    public static Singleton2 getSingleton2() {
        if (singleton == null) {        //这里可能会存在线程安全问题
            singleton = new Singleton2();
        }
        return singleton;
    }

    //类中其他方法,尽量是static
    public static void doSomething() {

    }
}
