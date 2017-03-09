package com.qf.chapter23.facade.universal.extend;

import com.qf.chapter23.facade.universal.ClassA;
import com.qf.chapter23.facade.universal.ClassC;

/**
 * Created by ios on 16/11/14.
 */

//门面对象,不要参与子系统中的业务逻辑,如果非要使用那么久封装一个类,然后再提供一个接口给门面

public class Context {
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();

    //复杂的计算
    public void complexMethod() {
        this.a.doSomethingA();
        this.c.doSomethingC();
    }
}
