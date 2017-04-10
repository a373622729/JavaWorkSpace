package com.mybatis.mapper;

import com.mybatis.po.Orders;
import com.mybatis.po.OrdersCustom;
import com.mybatis.po.User;

import java.util.List;

/**
 * Created by ios on 17/4/10.
 * 一对一的查询,使用resultType简单
 */
public interface OrdersMapperCustom {
    //查询订单,关联查询用户,一对一关系
    List<OrdersCustom> findOrdersUser() throws Exception;

    //查询订单,关联查询用户,一对一关系,用resultMap
    List<Orders> findOrdersUserResultMap() throws Exception;

    //查询订单,关联用户,及订单明细
    List<Orders> findOrdersAndOrderDetailsResultMap() throws Exception;

    //查询用户购买的商品信息
    List<User> findUserAndItemsResultMap() throws Exception;

}
