package com.ssm.dao;

import com.ssm.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 实现类中要继承 SqlSessionDaoSupport
 */
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO {

    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.selectOne("test.findUserById", id);
    }

}
