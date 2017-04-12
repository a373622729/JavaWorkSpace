package com.ssm.mapper;

import com.ssm.po.User;

/**
 * Created by ios on 17/4/6.
 * mapper接口,相当于dao接口
 */
public interface UserMapper {
    //根据id查询用户信息
    User findUserById(int id) throws Exception;

}
