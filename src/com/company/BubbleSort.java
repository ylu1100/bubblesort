package com.company;

public class BubbleSort {
    private int[]testArr;
    public BubbleSort(int[]testArr){
        this.testArr=testArr;
    }
    public static void bubbleSort(int[]testArr){
        int x = 0;
        int y = 0;
        while(x!=testArr.length-1){
            for(int i = x+1;i<testArr.length;i++){
                if(testArr[x]>testArr[i]){
                   swap(testArr,x,y,i);
                }
            }
            x++;
        }
    }
    public static void swap(int[]testArr,int x,int y,int i){
        y = testArr[x];
        testArr[x]=testArr[i];
        testArr[i]=y;
    }
}
