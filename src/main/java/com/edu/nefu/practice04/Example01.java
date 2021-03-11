package com.edu.nefu.practice04;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scan= new Scanner(System.in);
        try {
            for (int i=0;i<6;i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(Arrays.toString(arr));
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("请输入至少6个整数");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("未知错误");
            e.printStackTrace();
        }
        finally {
            System.out.println("程序结束");
            scan.close();
        }
    }
}
