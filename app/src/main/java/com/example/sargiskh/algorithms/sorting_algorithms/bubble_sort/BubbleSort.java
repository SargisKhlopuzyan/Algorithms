package com.example.sargiskh.algorithms.sorting_algorithms.bubble_sort;

import android.util.Log;

import java.util.Arrays;

// http://www.java2novice.com/java-sorting-algorithms/bubble-sort/

// Bubble sort has worst-case and average complexity both О(n2), where n is the number of items being sorted.
// There exist many sorting algorithms with substantially better worst-case or average complexity of O(n log n).
// Even other О(n2) sorting algorithms, such as insertion sort, tend to have better performance than bubble sort.
// Therefore, bubble sort is not a practical sorting algorithm when n is large.
// Performance of bubble sort over an already-sorted list (best-case) is O(n).
public class BubbleSort {

    public static void main() {
        int[] unSortedArray = { 4, 2, 9, 6, 23, 12, 34, 0, 1, -1 };
        bubbleSort_Version_1(unSortedArray);
//        bubbleSort_Version_2(unSortedArray);
//        bubbleSrt(unSortedArray);

    }

    public static void bubbleSort_Version_1(int array[]) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int k = 0; k < i; k++) {
                if (array[k] > array[k+1]) {
                    int temp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = temp;
                }
            }
            Log.e("LOG_TAG", "array: " + Arrays.toString(array));
        }
    }

    private static void bubbleSort_Version_2(int[] unSortedArray) {
        for (int i = 0; i < unSortedArray.length-1; i++) {
            for (int k = i+1; k < unSortedArray.length; k++) {
                if (unSortedArray[i] > unSortedArray[k]) {
                    int temp = unSortedArray[i];
                    unSortedArray[i] = unSortedArray[k];
                    unSortedArray[k] = temp;
                }
            }
            Log.e("LOG_TAG", "unSortedArray: " + Arrays.toString(unSortedArray));
        }
    }

    // logic to sort the elements
    private static void bubbleSrt(int array[]) {
        int k;
        for (int m = array.length; m >= 0; m--) {
            for (int i = 0; i < array.length - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
            Log.e("LOG_TAG", "array: " + Arrays.toString(array));
        }
    }

}
