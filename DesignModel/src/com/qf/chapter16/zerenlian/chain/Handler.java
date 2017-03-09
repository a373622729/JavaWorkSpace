package com.qf.chapter16.zerenlian.chain;

/**
 * Created by ios on 16/11/1.
 */

/**
 * 抽象处理者实现3个职责:
 * 1.定义一个请求的处理方法handleMessage,唯一对外开放的方法
 * 2.定义一个链的编排方法,setNext
 * 3.定义了具体的请求者必须实现的两个方法:
 *      定义自己能够处理的级别,getHandlerLevel,或者Handle(int level)构造方法
 *      具体的处理任务response
 *
 *
 *  在具体业务中,level,request,response都可以定义为一个类
 *
 *  实际应用中,会有一个封装类对责任模式进行封装,也就是替代Client类,直接返回链中的第一个处理着,具体的链不需要高层来设置
 *
 *
 *  注意事项:
 *      链中的节点数量需要控制,避免出现超长链的情况,一般的做法是在Handler中设置一个最大节点数量,在setNext中判断是否超过阈值.
 *      避免无意识地破坏系统性能
 *
 *  也可以用作补救:
 *      比如一个银行,开始只处理人民币,后来又要处理美元,日元等等,那么就可以直接在第一个处理者后面建立一个链.
 */

class Level {
    //定义一个请求和处理等级
}

class Request {
    //请求的等级
    public Level getRequestLevel() {
        return null;
    }
}

class Response {
        //处理者返回的数据
}

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    //能处理的级别
    private int level = 0;
    //责任传递,下一个责任人是谁
    private Handler nextHandler;
    //每个类都要说明一下,自己能处理哪些请求
    public Handler(int _level) {
        this.level = _level;
    }
    //模板方法
    public final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else if (this.nextHandler != null) {
            this.nextHandler.handleMessage(women);
        } else {
            System.out.println("---没地方请示了,按不同意处理---");
        }
    }
    //设置下一个环节的人
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract void response(IWomen women);
}
