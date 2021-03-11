package com.edu.nefu.homework.example02;

public class MyArray {
    private final int leng = 5;//设置初始数组的长度
    private int[] arr = new int[leng];
    private int num = 0;//已赋值数组的长度

    public MyArray() {

    }

    void add(int value) {
        renum();
        this.arr[num] = value;
        this.num++;
    }

    void get(int index) {
        if (index >= num) {
            System.out.println("超出检索范围，请输入正确的索引位置");
        } else {
            System.out.println("第" + index + "个的索引的值为:" + this.arr[index - 1]);
        }
    }

    void remove(int index) {
        if (index >= num) {
            System.out.println("超出检索范围，请输入正确的索引位置");
        } else {
            for (int i = index - 1; i < num; i++) {
                arr[i] = arr[i + 1];
            }
            num--;
        }
    }

    void add(int position, int value) {
        renum();
        for (int i = num; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position - 1] = value;
        num++;
    }
    void set(int position, int value){
        arr[position - 1] = value;
    }
    void renum(){
        if (num==arr.length){
            int[] newArr =  new int[arr.length*3/2+1];
            System.arraycopy(arr,0,newArr,0,num);
            arr=newArr;
        }
    }
    public int size() {
        return num;
    }
}
