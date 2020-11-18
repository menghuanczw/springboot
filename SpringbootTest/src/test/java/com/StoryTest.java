package com;

import com.service.StoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoryTest {
    @Autowired
    private StoryService storyService;

    @Test
    public void test(){
        storyService.storyService();
    }
}
