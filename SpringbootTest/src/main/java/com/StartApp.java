package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * springboot 启动类，加 @SpringBootApplication 注解
 * 测试类 StoryTest 加 @RunWith(SpringRunner.class) 和 @SpringBootTest 注解
 * 测试类 方法 加 @Test 注解 可 @Autowired  逻辑层 和 到层 实例来调用方法
 *
 */
@SpringBootApplication
public class StartApp extends SpringBootServletInitializer {
    public static void main(String [] args){
        SpringApplication.run(StartApp.class);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StartApp.class);
    }
}
