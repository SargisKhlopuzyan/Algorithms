package com.example.sargiskh.algorithms.sorting_algorithms.quick_sort;

import android.util.Log;

import java.util.Arrays;

// http://www.java2novice.com/java-sorting-algorithms/quick-sort/

// The complexity of quick sort in the average case is Θ(n log(n)) and in the worst case is Θ(n2).
public class QuickSort {

    private static int array[];

    public static void main(){
        array = new int[]{24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        sort(array);
    }

    private static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
//        this.array = inputArr;
        quickSort(0, array.length - 1);
    }

    private static void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            Log.e("LOG_TAG", "SortedArray: " + Arrays.toString(array));

            if (lowerIndex < j) {
                quickSort(lowerIndex, j);
            }

            if (i < higherIndex) {
                quickSort(i, higherIndex);
            }

        }
    }

}
