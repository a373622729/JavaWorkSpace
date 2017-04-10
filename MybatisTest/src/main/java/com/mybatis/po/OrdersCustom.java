package com.mybatis.po;

/**
 * Created by ios on 17/4/10.
 * 订单的拓展类, 通过此类映射订单和用户的查询结果,让此类继承字段包括多的pojo类
 */
public class OrdersCustom extends Orders {

    private String username;
    private String sex;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
