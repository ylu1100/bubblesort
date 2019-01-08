package com.company;

public class Main {

    public static void main(String[] args) {
        int[]testArr = BubbleSort.randomIntArr(8);
        int[]before=testArr;

        for(int num:testArr){
            System.out.print(num+" ");
        }
        System.out.println();
        BubbleSort.bubbleSort(testArr);

        int[]after=testArr;
        for(int num:testArr){
            System.out.print(num+" ");// write your code here
        }
        System.out.println();
        SortingUtil.selectionsort(testArr);
        for(int num:testArr){
            System.out.print(num+" ");// write your code here
        }
        System.out.println();
        long time = System.nanoTime();
        SortingUtil.bubbleSort(testArr);
        time = System.nanoTime()-time;
        System.out.println("Time Taken: "+time);
        System.out.println("Is it sorted?: "+ BubbleSort.isSorted(testArr));
        System.out.println("Are the sums equal? :"+SortingUtil.checkSum(before,after));
    }
}
