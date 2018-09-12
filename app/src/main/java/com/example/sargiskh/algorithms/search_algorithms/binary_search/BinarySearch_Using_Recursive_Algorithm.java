package com.example.sargiskh.algorithms.search_algorithms.binary_search;

import android.util.Log;

// A binary search or half-interval search algorithm finds the position of a specified value (the input "key") within a sorted array. I
// Binary search requires a sorted collection. Also, binary searching can only be applied to a collection that allows random access (indexing).
// Worst case performance: O(log n)
// Best case performance: O(1)
public class BinarySearch_Using_Recursive_Algorithm {

    public static void main() {
        int[] sortedArray = {2, 45, 234, 567, 876, 900, 976, 999};
        int index = recursiveBinarySearch(sortedArray, 2, 0, sortedArray.length-1);
        Log.e("LOG_TAG", "Found 2 at " + index + " index");
        index = recursiveBinarySearch(sortedArray,876,0, sortedArray.length-1);
        Log.e("LOG_TAG", "Found 876 at " + index + " index");
        index = recursiveBinarySearch(sortedArray,999, 0, sortedArray.length-1);
        Log.e("LOG_TAG", "Found 999 at " + index + " index");
    }

    public static int recursiveBinarySearch(int[] sortedArray, int key, int start, int end) {

        if (start == end) {
            if (key == sortedArray[start]) {
                return start;
            }
        }else if (start < end) {
            int mid = (start + end) / 2;
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, key, start, mid-1);
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, key, mid + 1, end);
            } else {
                return mid;
            }
        }
        return -1;
    }

}
