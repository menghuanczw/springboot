package com.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtil {
    /**
     * 创建一个文件
     * @param path
     */
    public static void createFile(String path){
        File f=new File(path);
        FileWriter wf = null;
        try {
            wf = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(wf);
            for(int j=0;j<50;j++){
                for(int i=0;i<10;i++){
                    String content="第"+j+"组；第"+i+"条信息！";
                    pw.println(content);
                }
            }
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
