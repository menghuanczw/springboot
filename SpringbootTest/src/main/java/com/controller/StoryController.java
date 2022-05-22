package com.controller;


import com.service.StoryService;
import com.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class StoryController {
    private static final Logger log = LoggerFactory.getLogger(StoryController.class);
    @Autowired
    private StoryService storyService;

    @RequestMapping("/test")
    public String storyTest(){
        storyService.storyService();
        return "index";
    }
    @RequestMapping("/down")
    public String downLoad(HttpServletResponse httpServletResponse){
        try {
            log.info("开始下载文件");
            // 设置文件后缀
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            //文件名
            String fn = "新文件" + sdf.format(new Date()) + ".txt";
            // 读取字符编码
            String utf = "UTF-8";

            // 设置响应
//            httpServletResponse.setContentType("application/octet-stream");
//            httpServletResponse.setHeader("Content-Disposition","attachment;filename=" + fileName);
//            httpServletResponse.setContentLength((int) file.length());
            httpServletResponse.setContentType("application/ms-txt.numberformat:@");
            httpServletResponse.setCharacterEncoding(utf);
            httpServletResponse.setHeader("Pragma", "public");
            httpServletResponse.setHeader("Cache-Control", "max-age=30");
            httpServletResponse.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fn, utf));
            OutputStream os = httpServletResponse.getOutputStream();
            String path = "D:\\u01\\down\\new.txt";
            FileUtil.createFile(path);
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            os.write(bufferedReader.toString().getBytes("utf-8"));
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return HttpStatus.OK.toString();
    }

}
