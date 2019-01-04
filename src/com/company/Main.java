package com.company;

public class Main {

   public static void main(String[] args) {
       int[]testArr = {8,6,7,5,3,0,9,10,1,2,3};
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
       long time = System.nanoTime();
       SortingUtil.bubbleSort(testArr);
       time = System.nanoTime()-time;
       System.out.println("Time Taken: "+time);
       System.out.println("Is it sorted?: "+ SortingUtil.isSorted(testArr));
       System.out.println("Are the sums equal? :"+SortingUtil.checkSum(before,after));
   }
}

