package com.company;

import java.util.Arrays;

public class SortingUtil {
    public static void swap(int[] testArr, int x, int i) {
        int y = testArr[x];
        testArr[x] = testArr[i];
        testArr[i] = y;
    }

    public static int[] randomIntArr(int count) {
        int[] arr = new int[count];
        for (int counter = 0; counter < count; counter++) {
            arr[counter] = (int) (Math.random() * 10000);
            counter++;
        }
        return arr;
    }

    public static void bubbleSort(int[] testArr) {
        int x = 0;
        while (x != testArr.length - 1) {
            for (int i = x + 1; i < testArr.length; i++) {
                if (testArr[x] > testArr[i]) {
                    swap(testArr, x, i);
                }
            }
            x++;
        }
    }

    public static boolean isSorted(int[] testArr) {
        for (int x = 0; x < testArr.length - 1; x++) {
            if (testArr[x] > testArr[x + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int sumbefore = 0;
        int sumafter = 0;
        for (int x = 0; x != before.length - 1; x++) {
            sumbefore = sumbefore + before[x];
        }
        for (int y = 0; y != after.length - 1; y++) {
            sumafter = sumafter + after[y];
        }
        return sumafter == sumbefore;
    }

    public static void selectionsort(int[] testArr) {
        int minvalue = testArr[0];
        int minloc=0;
        int y=0;
       for(int min = 0;min != testArr.length-1;min++) {
            for (int i = min + 1; i < testArr.length; i++) {
                if (testArr[min] > testArr[i]) {
                    y = testArr[min];
                    minvalue = testArr[i];
                    minloc=i;
                }
            }
           testArr[min]=minvalue;
            testArr[minloc] = y;
        }

    }
}


