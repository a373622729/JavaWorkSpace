package com.ssm.dao;

import com.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDAOImplTest {
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        //得到spring容器
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

    }

    @Test
    public void testFindUserById() throws Exception {
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDao");
        User user = userDAO.findUserById(1);
        System.out.println(user);
    }
}