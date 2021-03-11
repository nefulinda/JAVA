package com.edu.nefu.filestest;

import java.io.*;

public class FileDemo07 {
    public static void main(String[] args) {
        //需求，想要从一个文本文档中写入内容
        //创建一个File对象
        File file =  new File("D:"+File.separator+"java2101"+File.separator+"hello"+File.separator+"a.txt");
        //创建一个输出流的对象
        OutputStream out =null;
        try {
             out = new FileOutputStream(file);
            String str = "helloworld";
            //写入数据  getBytes将字符串转换成字节流数组
            out.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
