package com.example.sargiskh.algorithms.sorting_algorithms.insertion_sort;

import android.util.Log;

import java.util.Arrays;

// http://www.java2novice.com/java-sorting-algorithms/insertion-sort/

// The best case input is an array that is already sorted. In this case insertion sort has a linear running time (i.e., Θ(n)).
// During each iteration, the first remaining element of the input is only compared with the right-most element of the sorted subsection of the array.
// The simplest worst case input is an array sorted in reverse order.
// The set of all worst case inputs consists of all arrays where each element is the smallest or second-smallest of the elements before it.
// In these cases every iteration of the inner loop will scan and shift the entire sorted subsection of the array before inserting the next element.
// This gives insertion sort a quadratic running time (i.e., O(n2)).
// The average case is also quadratic, which makes insertion sort impractical for sorting large arrays.
public class InsertionSort {

    public static void main(){
        int[] unSortedArray = {10, 34, 2, 56 , 7, 67, 88, 42};
        doInsertionSort(unSortedArray);
    }

    private static void doInsertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } else {
                    break;
                }
            }
            Log.e("LOG_TAG", "unSortedArray: " + Arrays.toString(array));
        }
    }
}