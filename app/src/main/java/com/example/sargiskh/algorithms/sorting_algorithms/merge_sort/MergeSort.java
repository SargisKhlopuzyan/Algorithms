package com.example.sargiskh.algorithms.sorting_algorithms.merge_sort;

import android.util.Log;

import java.util.Arrays;

// http://www.java2novice.com/java-sorting-algorithms/merge-sort/

// Merge sort is a fast, stable sorting routine with guaranteed O(n*log(n)) efficiency.
// When sorting arrays, merge sort requires additional scratch space proportional to the size of the input array.
// Merge sort is relatively simple to code and offers performance typically only slightly below that of quicksort.
public class MergeSort {

    private static int[] unSortedArray;
    private static int[] tempMergeArray;

    public static void main(){

        try {
            Object quickSort = Class.forName("QuickSort").newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        unSortedArray = new int[]{45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        tempMergeArray = new int[unSortedArray.length];
        doMergeSort(0, unSortedArray.length - 1);
    }

    private static void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middleIndex = (lowerIndex + higherIndex) / 2;
            doMergeSort(lowerIndex, middleIndex);
            doMergeSort(middleIndex + 1, higherIndex);
            mergeParts(lowerIndex, middleIndex, higherIndex);
        }
        Log.e("LOG_TAG", "SortedArray: " + Arrays.toString(unSortedArray));
    }

    private static void mergeParts(int lowerIndex, int middleIndex, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArray[i] = unSortedArray[i];
        }
        int i = lowerIndex;
        int j = middleIndex + 1;
        int k = lowerIndex;

        while (i <= middleIndex && j <= higherIndex) {
            if (tempMergeArray[i] <= tempMergeArray[j]) {
                unSortedArray[k] = tempMergeArray[i];
                i++;
            } else {
                unSortedArray[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }

        while (i <= middleIndex) {
            unSortedArray[k] = tempMergeArray[i];
            k++;
            i++;
        }

    }

}
