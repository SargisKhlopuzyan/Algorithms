package com.example.sargiskh.algorithms.sorting_algorithms.selection_sort;

import android.util.Log;

import java.util.Arrays;

// http://www.java2novice.com/java-sorting-algorithms/selection-sort/

// Selection sort is not difficult to analyze compared to other sorting algorithms since none of the loops depend on the data in the array.
// Selecting the lowest element requires scanning all n elements (this takesn − 1 comparisons) and then swapping it into the first position.
// Finding the next lowest element requires scanning the remaining n − 1 elements and so on, for (n − 1) + (n − 2) + ... + 2 + 1 = n(n − 1) / 2 ∈ Θ(n2) comparisons.
// Each of these scans requires one swap for n − 1 elements.
public class SelectionSort {

    public static void main(){
        int[] unSortedArray = {10, 34, 2, 56, 7, 67, 88, 42, 99, 0};
        doSelectionSort(unSortedArray);
    }

    private static void doSelectionSort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {

            int smallerIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallerIndex]) {
                    smallerIndex = j;
                }
            }

            if (array[i] > array[smallerIndex]) {
                int smallerNumber = array[smallerIndex];
                array[smallerIndex] = array[i];
                array[i] = smallerNumber;
            }
            Log.e("LOG_TAG", "unSortedArray: " + Arrays.toString(array));
        }
    }

}
