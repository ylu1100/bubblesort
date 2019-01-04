package com.company;

public class SortingUtil {
    public static void swap(int[]testArr,int x,int y,int i){
        y = testArr[x];
        testArr[x]=testArr[i];
        testArr[i]=y;
    }
    public static int[]randomIntArr(int count){
        int []arr=new int[count];
        for(int counter = 0;counter!=count-1;counter++){
            arr[counter]=(int)(Math.random()*10000);
            counter++;
        }
        return arr;
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
}

