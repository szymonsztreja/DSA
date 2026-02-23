package org.example;

import org.example.algorithims.*;
import org.example.searching.BinarySearch;
import org.example.searching.LinearSearch;
import org.example.searching.SearchingAlgorithim;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[20];
        Random rand = new Random();
//        for (int i = 0; i < 20; i++) {
//            arr[i] = rand.nextInt(100);  // 0 to 99
//        }
        int[] arr = rand.ints(20, 0, 100).toArray();

        System.out.println(Arrays.toString(arr));
        SortingAlgorithim sortingAlgorithim = new MergeSort();
        sortingAlgorithim.sort(arr);
        System.out.println(Arrays.toString(arr));

        SearchingAlgorithim sa = new LinearSearch();
        System.out.println(sa.search(arr, 42));
        sa = new BinarySearch();
        System.out.println(sa.search(arr, 42));


    }
}