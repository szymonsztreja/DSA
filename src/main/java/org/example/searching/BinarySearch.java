package org.example.searching;

public class BinarySearch implements SearchingAlgorithim{
    public BinarySearch() {
    }

    @Override
    public int search(int[] arr, int searchedValue) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == searchedValue) {
                return mid;
            }
            // jesli arr[mid] < searched -> idziemy w prawo
            if ( arr[mid] < searchedValue){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
