package com.controller;

import com.rabbitmq.Sender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {
    private static final Logger logger = LoggerFactory.getLogger(RabbitController.class);
    @Autowired
    private Sender sender;

    @RequestMapping("/sender")
    public String sender() {
        logger.info(" Rabbit 开始发送信息！");
        sender.send();
        return "sender OK";
    }

}
