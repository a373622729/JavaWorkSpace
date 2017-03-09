package com.qf.chapter28.flyweight.objpool;

/**
 * Created by ios on 16/11/20.
 */

//带对象池的报考信息

public class SignInfo4Pool extends SignInfo{
    //key的标准:考试科目+考试地点
    //一个key唯一对应一个对象

    //定义一个对象池提取KEY的值
    private String key;
    //构造函数获得相同的标志

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
