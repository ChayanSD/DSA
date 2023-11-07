package Algorithms.Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
    int [] arr = {3,4,2,1};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int [] arr){
        if(arr.length ==0 || arr.length <=1){
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if (num > max){
                max = num;
            }
        }

        int [] countArray = new int[max+ 1];
        //This is the frequency array of original array size + 1.

        for (int num : arr){
            countArray[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0){
                arr[index] = i;
                index ++;
                countArray[i]--;
            }
        }
    }
}

//Counting sort is a sorting technique based on keys between a specific range.
//It is non comparison based sorting.
//It works by counting the number of objects having distinct key values (kind of hashing).
//Time Complexity: O(n+m) where n is the number of elements in input array and m is the range of input.
//Auxiliary Space: O(n+m)