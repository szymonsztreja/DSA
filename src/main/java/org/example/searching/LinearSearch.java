package org.example.searching;

public class LinearSearch implements SearchingAlgorithim{

    public LinearSearch(){

    }

    @Override
    public int search(int[] arr, int searchedValue) {

        for (int i = 0; i < arr.length; i++){
            if ( arr[i] == searchedValue){
                return i;
            }
        }
        return -1;
    }
}
