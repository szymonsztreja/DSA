package org.example.algorithims;

import java.util.Arrays;

public class InsertionSort implements SortingAlgorithim{

    public InsertionSort(){
    }

    @Override
    public void sort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++){

            int key = arr[i];
            int j = i - 1;

            while ( j >= 0 && arr[j] > key){

                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println("Pass:" + i + Arrays.toString(arr));
            int[] arraySlice = Arrays.stream(arr).limit(i).toArray();
            System.out.println("Arr[:i] " + Arrays.toString(arraySlice) + " Key: " + key);
        }
    }
}
