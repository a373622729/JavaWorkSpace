package com.ssm.mapper;

import com.ssm.po.Items;
import com.ssm.po.ItemsExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ios on 17/4/12.
 */
public class ItemsMapperTest {
    private ApplicationContext applicationContext;
    private ItemsMapper itemsMapper;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
    }

    @Test
    public void testSelectByExample() throws Exception {
        ItemsExample itemsExample = new ItemsExample();
        ItemsExample.Criteria criteria = itemsExample.createCriteria();
        criteria.andNameEqualTo("笔记本");
        List<Items> itemses = itemsMapper.selectByExample(itemsExample);
        System.out.println(itemses);
    }
}