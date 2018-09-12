package com.example.sargiskh.algorithms.search_algorithms.linear_search;

import android.util.Log;

// The worst case performance scenario for a linear search is that it has to loop through the entire collection, either because the item is the last one, or because the item is not found.
// In other words, if you have N items in your collection, the worst case scenario to find an item is N iterations.
// In Big O Notation it is O(N). The speed of search grows linearly with the number of items within your collection.
public class LinearSearch {

    public static void main(){
        int[] notSorttedArray1= {23, 45, 21, 55, 234, 1, 34, 90};
        int searchKey = 34;
        Log.e("LOG_TAG","Key "+searchKey+" found at index: "+ search(notSorttedArray1, searchKey));

        int[] notSorttedArray2= {123, 445, 421, 595, 2134, 41, 304, 190};
        searchKey = 421;
        Log.e("LOG_TAG","Key "+searchKey+" found at index: "+ search(notSorttedArray2, searchKey));
    }

    private static int search(int[] notSorttedArray, int key) {
        int size = notSorttedArray.length;
        for (int i = 0; i < size; i++) {
            if (notSorttedArray[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
