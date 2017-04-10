package com.mybatis.first;

import com.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by ios on 17/4/6.
 */
public class MybatisFirst {

    private SqlSession getSqlSession() {
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //创建会话工厂
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂得到session
        return sqlSessionFactory.openSession();
    }

    public void findUserById() throws IOException {
        SqlSession sqlSession = getSqlSession();

        //第一个参数映射文件中的statment的id,namespace.id
        User user = sqlSession.selectOne("test.findUserById", 1);

        System.out.println(user);
        //释放资源
        sqlSession.close();
    }

    public void findUserByName() throws IOException {
        SqlSession sqlSession = getSqlSession();

        //第一个参数映射文件中的statment的id,namespace.id
        List<User> list = sqlSession.selectList("test.findUserByName","小明");

        System.out.println(list);
        //释放资源
        sqlSession.close();
    }

    public void insertUser() {
        SqlSession sqlSession = getSqlSession();
        User user = new User();
        user.setUsername("齐大富");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("西安");
        sqlSession.insert("test.insertUser", user);
        //这里要commit进行事物
        sqlSession.commit();

        //获取用户信息新增的主键
        System.out.println(user.getId());
        sqlSession.close();
    }

    public void deleteUser() {
        SqlSession sqlSession = getSqlSession();

        sqlSession.delete("test.deleteUser",28);
        //这里要commit进行事物
        sqlSession.commit();

        sqlSession.close();
    }

    public void updateUser() {
        SqlSession sqlSession = getSqlSession();
        User user = sqlSession.selectOne("test.findUserById",27);
        user.setAddress("西安电子科技大学");
        sqlSession.update("test.updateUser",user);
        sqlSession.commit();
        sqlSession.close();
    }
}
