package Algorithms.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
            int [] arr={4,3,2,1};
            cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    //This is very,very important algorithm .
    //If question gives you Range like 1 to N .Use cyclic sort.

    /*
    How cyclic sort works?
    In real worlds array contain 1 to N things
    If we Look carefully in sorted array index = value -1;
    check , swap , move ->steps
     */
    static void cyclic(int [] arr){
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
    }
    static void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
//TC : O(N).
