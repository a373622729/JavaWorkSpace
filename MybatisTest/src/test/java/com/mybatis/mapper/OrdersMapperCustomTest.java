package com.mybatis.mapper;

import com.mybatis.po.Orders;
import com.mybatis.po.OrdersCustom;
import com.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by ios on 17/4/10.
 */
public class OrdersMapperCustomTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //创建会话工厂
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    @Test
    public void testFindOrdersUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
        List<OrdersCustom> list               = ordersMapperCustom.findOrdersUser();
        System.out.println(list);

        sqlSession.close();
    }

    @Test
    public void testFindOrdersUserResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
        List<Orders>       list               = ordersMapperCustom.findOrdersUserResultMap();
        System.out.println(list);

        sqlSession.close();
    }

    @Test
    public void testFindOrdersAndOrderDetailsResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
        List<Orders>       list               = ordersMapperCustom.findOrdersAndOrderDetailsResultMap();
        System.out.println(list);

        sqlSession.close();
    }


    @Test
    public void testFindUserAndItemsResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
        List<User>         list               = ordersMapperCustom.findUserAndItemsResultMap();
        System.out.println(list);

        sqlSession.close();
    }


    @Test
    public void testFindOrdersUserLazyLoading() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
        List<Orders>       list               = ordersMapperCustom.findOrdersUserLazyLoading();

        for (Orders orders : list) {
            //执行getUser()实现按需加载
            User user = orders.getUser();
            System.out.println(user);
        }

        sqlSession.close();
    }
}