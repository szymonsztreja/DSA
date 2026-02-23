package org.example.algorithims;

public class MergeSort implements SortingAlgorithim{

    public MergeSort(){

    }

    public static int[] mergeSort(int[] arr){

        if( arr.length <= 1){
            return arr;
        }

        int mid = arr.length / 2;

        int leftSize = mid;
        int rightSize = arr.length - mid;

        int[] leftHalf = new int[leftSize];
        int[] rightHalf = new int[rightSize];

        // copy the arrays
        for (int i = 0; i < leftSize; i++){
            leftHalf[i] = arr[i];
        }

        for (int j = 0; j < rightSize; j++){
            rightHalf[j] = arr[mid + j];
        }

        int[] sortedLeft = mergeSort(leftHalf);
        int[] sortedRight = mergeSort(rightHalf);

        return merge(sortedLeft, sortedRight);
    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while( i < left.length && j < right.length){
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // kopiuj pozostałe wartosci
        while ( i < left.length){
            result[k++] = left[i++];
        }

        while ( j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    @Override
    public void sort(int[] arr) {
        int[] sorted = mergeSort(arr);
        System.arraycopy(sorted, 0, arr, 0, arr.length);
    }

}
