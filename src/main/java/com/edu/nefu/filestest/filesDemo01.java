package com.edu.nefu.filestest;

import java.io.File;
import java.io.IOException;

public class filesDemo01 {
    public static void main(String[] args) {
        File file01 =  new File("d:"+File.separator+"java2101" +File.separator+"hello.txt");
        if (file01.exists()){
            System.out.println(file01.length());
            System.out.println(file01.getAbsolutePath());
            System.out.println(file01.lastModified());
        }
        else {
            try {
                file01.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
