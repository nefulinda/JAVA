package com.edu.nefu.filestest;

import java.io.*;

public class FileDemo08 {
    public static void main(String[] args) {
        //需求，想要从一个文本文档中读取内容
        //1.创建一个File对象
        File file =  new File("D:"+File.separator+"java2101"+File.separator+"hello"+File.separator+"a.txt");
        //2.创建一个输入流的对象
        InputStream input_Str =null;
        try {
            input_Str = new FileInputStream(file);
         //3.执行读取操作
            byte[] b= new byte[1024];
            int length =  input_Str.read(b);
            String str =  new String(b);
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                input_Str.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
