package com.example.sargiskh.algorithms.search_algorithms.binary_search;

import android.util.Log;

// A binary search or half-interval search algorithm finds the position of a specified value (the input "key") within a sorted array. I
// Binary search requires a sorted collection. Also, binary searching can only be applied to a collection that allows random access (indexing).
// Worst case performance: O(log n)
// Best case performance: O(1)
public class BinarySearch_Using_Divide_And_Conquer_Technique {

    public static void main() {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16};
        Log.e("LOG_TAG","Key 14's position: " + search(sortedArray, 14));

        int[] sortedArray1 = {6,34,78,123,432,900};
        Log.e("LOG_TAG","Key 432's position: "+ search(sortedArray1, 432));
    }

    private static int search(int[] sortedArray, int key) {
        int start = 0;
        int end = sortedArray.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == sortedArray[mid]) {
                return mid;
            }
            if (key < sortedArray[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
