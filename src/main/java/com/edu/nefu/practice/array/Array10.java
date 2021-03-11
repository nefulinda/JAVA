package com.edu.nefu.practice.array;

public class Array10 {
    public static void main(String[] args) {
        int[][] arrayDemo =  {{11,15,32,21},{2,3},{4,5,6}};
      for (int i=0;i< arrayDemo.length;i++){
          for (int j=0;j<arrayDemo[i].length;j++){
              for (int k=0;k<arrayDemo[i].length-i-1;k++){
                  if (arrayDemo[i][k]>arrayDemo[i][k+1]){
                      int temp =arrayDemo[i][k+1];
                      arrayDemo[i][k+1]=arrayDemo[i][k];
                      arrayDemo[i][k]=temp;
                  }
              }
          }
      }
        for (int i = 0; i < arrayDemo.length; i++) {
            for (int j = 0; j < arrayDemo[i].length; j++) {
                System.out.print(arrayDemo[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
