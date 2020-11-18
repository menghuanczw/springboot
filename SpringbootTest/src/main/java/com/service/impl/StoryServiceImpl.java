package com.service.impl;

import com.dao.StoryDao;
import com.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoryServiceImpl implements StoryService {
    @Autowired
    private StoryDao storyDao;

    @Override
    public void storyService() {
        storyDao.testDao();
        System.out.println("调用业务层逻辑");
    }
}
