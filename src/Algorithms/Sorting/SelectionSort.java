package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7};
//        System.out.println(getMax(arr,0,arr.length-1));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    //We are going to select an element and put them it's right position.
    //Basically the idea is , Find the max item and put them is last so on
    static void selection(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length -i -1; //when i = 0 ; last index will be = length -1;
            int maxIndex = getMax(arr,0,lastIndex);
            //swap the max with last index.
            swap(arr,maxIndex,lastIndex);
        }
    }

     static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i<=end; i++){
            if(arr[max] <arr[i]){
                max= i;
            }
        }
        return max;
    }
    static void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
//O(N^2)
//Not stable