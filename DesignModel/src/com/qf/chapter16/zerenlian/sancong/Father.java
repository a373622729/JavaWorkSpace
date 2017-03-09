package com.qf.chapter16.zerenlian.sancong;

/**
 * Created by ios on 16/11/1.
 */
public class Father implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请求是:" + women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
