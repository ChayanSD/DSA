package Algorithms.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
    sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr , int low ,int high){
        if(low >= high){
            return;
        }
        //The idea is : low and high is know which array i am working on and s , e for swap things.
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
//Now my pivot is at correct index , its time to sort 2 halves of the array
        sort(arr,low,e);
        sort(arr,s,high);

    }
}
//Time : O(n*n)