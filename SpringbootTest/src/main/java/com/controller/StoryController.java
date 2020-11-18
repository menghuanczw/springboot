package com.controller;

import com.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StoryController {
    @Autowired
    private StoryService storyService;

    @RequestMapping("/test")
    @ResponseBody
    public String storyTest(){
        storyService.storyService();
        return "story,is good";
    }

}
