package com.edu.nefu.filestest;

import java.io.File;
import java.io.IOException;

public class FilesDemo05 {
    public static void main(String[] args) {
        //源文件
        File file01 = new File("d:" + File.separator + "java2101" + File.separator + "202122");
        //目标文件
        File file02 = new File("d:" + File.separator + "java2101" + File.separator + "hello");

      copyFiles(file01,file02);
    }

    public static void copyFiles(File oldFile, File newFile) {
        //获取源文件的文件名
        String fileName = oldFile.getName();
        //判断源文件是否是文件夹
        if (oldFile.isDirectory()) {
            //获取目标文件的路径名
            String newName = newFile.getAbsolutePath() + File.separator + fileName;
            //创建目标文件
            File file = new File(newName);
            file.mkdirs();
            //文件夹的子文件进行复制
            File[] files = oldFile.listFiles();
            for (File f : files) {
                copyFiles(f, file);
            }
        } else {
            String newName = newFile.getAbsolutePath() + File.separator + fileName;
            File file = new File(newName);
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
