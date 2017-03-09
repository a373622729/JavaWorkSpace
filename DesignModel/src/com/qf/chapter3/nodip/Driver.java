package com.qf.chapter3.nodip;

/**
 * Created by ios on 16/10/12.
 *
 * 依赖倒置原则 Dependence Inversion Principle -- DIP
 * 在java中的表现是:
 * 1.模块间的依赖通过抽象发生,实现类之间不发生直接依赖关系,其依赖关系是通过接口或抽象类产生的
 * 2.接口或抽象类不依赖于实现类
 * 3.实现类依赖接口或抽象类
 */
public class Driver {
    public void drive(Benz benz) {
        benz.run();
    }
}

