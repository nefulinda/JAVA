package com.edu.nefu.filestest;

import java.io.File;

public class FilesDemo03 {
    public static void main(String[] args) {
        File file02 = new File("d:" + File.separator + "java2101" + File.separator + "hello" + File.separator + "hello");
        filesDelete(file02);
    }

    static void filesDelete(File file) {
        if (file.isDirectory()) {//先判断是不是文件夹，不是则直接删除
            File[] files = file.listFiles();
            for (File f : files) {
                filesDelete(f);
            }
        } else {
            file.delete();
        }
    }
}
