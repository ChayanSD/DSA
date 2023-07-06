package Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            //for each step ,max item come at last respective index.
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
