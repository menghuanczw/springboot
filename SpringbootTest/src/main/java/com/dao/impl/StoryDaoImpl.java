package com.dao.impl;

import com.dao.StoryDao;
import org.springframework.stereotype.Repository;

@Repository
public class StoryDaoImpl implements StoryDao {
    @Override
    public void testDao() {
        System.out.println("获取dao层数据");
    }
}
