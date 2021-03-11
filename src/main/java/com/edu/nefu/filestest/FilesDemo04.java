package com.edu.nefu.filestest;

import java.io.File;
import java.io.IOException;

public class FilesDemo04 {
    public static void main(String[] args) {
        File file01 = new File("d:" + File.separator + "java2101" + File.separator + "hello" + File.separator + "hello.txt");
        File file02 = new File("d:" + File.separator + "java2101" + File.separator + "202122");
        //获取源文件的文件名
        String fileName = file01.getName();
        System.out.println(fileName);
        //判断文件夹是否存在,不存在则新建
        if (!file02.exists()) {
            //创建多级目录
            file02.mkdirs();
        }
        //获取目标文件的路径
        String file02Name = file02.getAbsolutePath();
        //形成新的文件
        file02 = new File(file02Name + File.separator+fileName);
        try {
            file02.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
