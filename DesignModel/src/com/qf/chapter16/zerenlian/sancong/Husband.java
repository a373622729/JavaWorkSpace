package com.qf.chapter16.zerenlian.sancong;

/**
 * Created by ios on 16/11/1.
 */
public class Husband implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请求是:" + women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
