package com.example.sargiskh.algorithms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sargiskh.algorithms.sorting_algorithms.insertion_sort.InsertionSort
import com.example.sargiskh.algorithms.sorting_algorithms.merge_sort.MergeSort
import com.example.sargiskh.algorithms.sorting_algorithms.quick_sort.QuickSort

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Searching algorithms
//        LinearSearch.main()
//        BinarySearch_Using_Divide_And_Conquer_Technique.main()
//        BinarySearch_Using_Recursive_Algorithm.main()

        // Sorting algorithms
//        BubbleSort.main()
//        SelectionSort.main()
//        InsertionSort.main()
//        QuickSort.main()
        MergeSort.main()
    }
}
