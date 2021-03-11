package com.edu.nefu.practice02.demo02;

public class Dic {
    private DicItem[] dicItems = new DicItem[5];
    private int size = 0;//

    public Dic(){

    }

    public Dic(DicItem[] dicItems) {
        this.dicItems = dicItems;
    }

    public DicItem[] getDicItems() {
        return dicItems;
    }

    public void setDicItems(DicItem[] dicItems) {
        this.dicItems = dicItems;
    }

    public void trans(String english) {
        int flag = 0;//标记词库中是否有这个单词，默认没有

        for (int i = 0; i < size; i++) {
            if (dicItems[i].getEnglish().equalsIgnoreCase(english)) {
                System.out.println(dicItems[i].getEnglish() + ":" + dicItems[i].getChinese());
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("词库中没有该单词");
        }
    }

    public void add(String english, String chinese) {
        resize();
        int flag = 0;//标记词库中是否有这个单词，默认没有
        for (int i = 0; i < size; i++) {
            if (this.dicItems[i].getEnglish().equalsIgnoreCase(english)) {
                System.out.println(english+" 词库中已有该单词");
                flag=1;
            }
        }
        if (flag==0){
            this.dicItems[size] = new DicItem(english,chinese);
            size++;
        }

    }
    //扩容DicItem数组长度
    protected void resize(){
        if (dicItems.length==size){
            DicItem[] newDicItem = new DicItem[dicItems.length*3/2+1];
            System.arraycopy(dicItems,0,newDicItem,0,size);
            dicItems=newDicItem;
        }
    }

}
