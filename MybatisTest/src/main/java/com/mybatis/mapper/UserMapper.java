package com.mybatis.mapper;

import com.mybatis.po.User;
import com.mybatis.po.UserCustom;
import com.mybatis.po.UserQueryVo;

import java.util.List;

/**
 * Created by ios on 17/4/6.
 * mapper接口,相当于dao接口
 */
public interface UserMapper {
    //用户信息综合查询
    List<UserCustom> findUserList(UserQueryVo queryVo) throws Exception;

    //用户信息综合查询总数
    int findUserCount(UserQueryVo queryVo) throws Exception;
    //使用resultMap输出
    User findUserByIdResultMap(int id) throws Exception;

    //根据id查询用户信息
    User findUserById(int id) throws Exception;
    //添加用户
    void insertUser(User user) throws Exception;
    //删除用户
    void deleteUser(int id) throws Exception;
    //根据用户名查询列表
    List<User> findUserByName(String name) throws Exception;
}
