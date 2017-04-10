package com.mybatis.first;

import org.junit.Test;

/**
 * Created by ios on 17/4/6.
 */
public class MybatisFirstTest {
    MybatisFirst first = new MybatisFirst();
    @Test
    public void testFindUserById() throws Exception {
        first.findUserById();
    }

    @Test
    public void testFindUserByName() throws Exception {
        first.findUserByName();
    }

    @Test
    public void testInsertUser() throws Exception {
        first.insertUser();
    }

    @Test
    public void testDeleteUser() throws Exception {
        first.deleteUser();
    }

    @Test
    public void testUpdateUser() throws Exception {
        first.updateUser();
    }
}