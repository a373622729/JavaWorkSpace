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
    //一级缓存测试
    @Test
    public void testCache1() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //第一次发起请求

        User user1 = userMapper.findUserById(1);
        System.out.println(user1);
        user1.setAddress("西安市");
        userMapper.updateUser(user1);
        sqlSession.commit();

        User user2 = userMapper.findUserById(1);
        System.out.println(user2);
        sqlSession.close();
    }
    //二级缓存测试,跨sqlSession的
    @Test
    public void testCache2() throws Exception {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = userMapper1.findUserById(1);
        System.out.println(user1);
        /*user1.setAddress("西安市");
        userMapper.updateUser(user1);
        sqlSession1.commit();*/
        //执行关闭操作,才将sqlSession中的数据写入到二级缓存区域
        sqlSession1.close();

        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        User user = userMapper3.findUserById(1);
        user.setUsername("张明明");
        userMapper3.updateUser(user);
        sqlSession3.commit();
        sqlSession3.close();

        //第一次发起请求
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = userMapper2.findUserById(1);
        System.out.println(user2);
        sqlSession2.close();

    }

}