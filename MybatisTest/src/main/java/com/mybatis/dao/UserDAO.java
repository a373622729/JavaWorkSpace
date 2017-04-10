package com.mybatis.dao;

import com.mybatis.po.User;

/**
 * Created by ios on 17/4/6.
 */
public interface UserDAO {
    //根据id查询用户信息
    User findUserById(int id) throws Exception;
    //添加用户
    void insertUser(User user) throws Exception;
    //删除用户
    void deleteUser(int id) throws Exception;
}
