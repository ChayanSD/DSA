package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, -12, 5, 6};
//        System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInPlace(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        //When you have only one element,You can't sort them ,Just return as it is.
        if (arr.length == 1) {
            return arr;
        }
        //Divide the array in 2 parts
        int mid = arr.length / 2;

        //Take to parts left and right sort them part wise then merge them
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        //Merge left and right
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        //Take a mix array that will contain the sorted element
        int[] mix = new int[first.length + second.length];
        int i = 0; //i is pointing to the first [] elements
        int j = 0; //j is pointing to the second [] elements
        int k = 0;//pointing mix []

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];//Add the small element in my mix array.
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //It may be possible one of the array not completed.
        //Add the remain element in mix array.
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }


    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

    }

//At every level n element are being merged
//Time complexity : O(n * log n)
//Space complexity : O(n)