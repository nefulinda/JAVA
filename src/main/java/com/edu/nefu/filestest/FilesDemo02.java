package com.edu.nefu.filestest;

import java.io.File;
import java.io.IOException;

public class FilesDemo02 {
    public static void main(String[] args) {
        File file02 = new File("d:"+File.separator+"java2101"+File.separator+"hello"+File.separator+"hello");
        file02.mkdirs();
        int i=500;
        while (i>0){
            try {
                File.createTempFile("java",".java",file02);
            } catch (IOException e) {
                e.printStackTrace();
            }
            i--;
        }

    }
}
