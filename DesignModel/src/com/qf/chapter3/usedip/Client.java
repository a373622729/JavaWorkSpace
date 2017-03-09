package com.qf.chapter3.usedip;

/**
 * Created by ios on 16/10/12.
 *  * 依赖倒置原则 Dependence Inversion Principle -- DIP
 * 在java中的表现是:
 * 1.模块间的依赖通过抽象发生,实现类之间不发生直接依赖关系,其依赖关系是通过接口或抽象类产生的
 * 2.接口或抽象类不依赖于实现类
 * 3.实现类依赖接口或抽象类
 */

/**
 * Client属于高层业务逻辑,他对低层模块的依赖都简历在抽象上.
 * 如果司机要开宝马车,只需要更改Client这个高层的逻辑即可,不需要更改低层的模块
 */
public class Client {
    public static void main(String[] args) {
        IDriver zhangSan = new Driver();
        ICar    benz     = new Benz();
        zhangSan.drive(benz);
    }
}
