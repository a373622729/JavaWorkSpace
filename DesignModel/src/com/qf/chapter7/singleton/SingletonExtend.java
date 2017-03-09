package com.qf.chapter7.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ios on 16/10/17.
 * 对单例模式的拓展,要求一个类,只可以产生两三个对象
 * cmd + shift + L 可以搜索选中的文字
 *
 * 如果考虑线程安全问题可以用Vector来代替ArrayList
 */

/**
 * 1.Vector的方法都是同步的,是线程安全的,而ArrayList不是,由于线程同步必然要影响性能,故,ArrayList性能比Vector好
 * 2.当Vector或ArrayList中元素超过初始大小,Vector会翻倍容量,而ArrayList是增加50%,所以ArrayList有利于节约内存
 */

/**
 * 在系统启动的时候就可以初始化单例模式的类来使得他生存在整个周期中
 */

///有上限的多例模式
public class SingletonExtend {
}

class Emperor {
    //定义最多能产生的数量
    private static int maxNumOfEmperor = 2;
    //每个皇帝都有名字,用这个ArrayList来容纳每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<String>();
    //定义一个列表,容纳所有皇帝实例
    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
    //定义当前皇帝序列号
    private static int countNumOfEmperor = 0;
    //产生所有对象
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("黄 " + (i+1) +" 帝"));
        }
    }

    private Emperor() {}

    private Emperor(String name) {
        nameList.add(name);
    }

    //随机获得一个皇帝对象
    private static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(2) + 1;
        return emperorList.get(countNumOfEmperor);
    }

    public static void say() {

    }
}