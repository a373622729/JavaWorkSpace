package com.qf.chapter16.zerenlian.sancong;

/**
 * Created by ios on 16/11/1.
 */
public class Women implements IWomen {
    /**
     * 通过int来描述妇女的个人状况
     * 1 -- 未出嫁
     * 2 -- 出嫁
     * 3 -- 夫死
     */
    private int type = 0;
    private String request = "";

    public Women(int _type, String _request) {
        this.type = _type;
        this.request = _request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
