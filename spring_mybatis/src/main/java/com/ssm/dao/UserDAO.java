package com.ssm.dao;

import com.ssm.po.User;

public interface UserDAO {
    //根据id查询用户信息
    User findUserById(int id) throws Exception;

}
