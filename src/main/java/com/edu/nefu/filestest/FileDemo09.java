package com.edu.nefu.filestest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileDemo09 {
    public static void main(String[] args) {
  testWriter();
    }
    public static void testWriter(){
        File file =  new File("d:"+File.separator+"java2101"+File.separator+"hello"+File.separator+"a.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            String str = "hello Java!";
            writer.write(str);
           // writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
