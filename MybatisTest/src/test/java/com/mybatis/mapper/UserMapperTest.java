package com.mybatis.mapper;

import com.mybatis.po.User;
import com.mybatis.po.UserCustom;
import com.mybatis.po.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ios on 17/4/6.
 */
public class UserMapperTest {
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
    public void testFindUserById() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /**
         *  mybatis自动生成mapper代理对象
         */
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1);

        sqlSession.close();
        System.out.println(user);
    }

    @Test
    public void testFindUserList() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /**
         *  mybatis自动生成mapper代理对象
         */
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
        userCustom.setSex("1");
        //userCustom.setUsername("张三丰");
        //传入多个id
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(10);
        ids.add(28);
        userQueryVo.setUserCustom(userCustom);
        userQueryVo.setIds(ids);

        List<UserCustom> list = userMapper.findUserList(userQueryVo);

        sqlSession.close();
        System.out.println(list);

    }

    @Test
    public void testFindUserCount() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /**
         *  mybatis自动生成mapper代理对象
         */
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
//        userCustom.setSex("1");
        //测试动态sql,如果不设置某个值,sql中不回拼接
        userCustom.setUsername("张三丰");
        userQueryVo.setUserCustom(userCustom);
        int count = userMapper.findUserCount(userQueryVo);

        sqlSession.close();
        System.out.println(count);
    }

    @Test
    public void testFindUserByIdResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /**
         *  mybatis自动生成mapper代理对象
         */
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findUserByIdResultMap(1);

        sqlSession.close();
        System.out.println(user);
    }
}