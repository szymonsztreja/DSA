package org.example.algorithims;

public class SelectionSort implements SortingAlgorithim{

    public SelectionSort() {
    }

    public void sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++){

            int min_index = i;

            for (int j = i + 1; j < n; j++){

                if ( arr[j] < arr[min_index]){
                    // update min_index if smaller element is found
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
