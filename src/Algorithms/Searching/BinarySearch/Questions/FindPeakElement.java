package Algorithms.Searching.BinarySearch.Questions;

public class FindPeakElement {
    //Mountain array means element will increase the decrease.
    public static void main(String[] args) {
        int [] arr = {1,3,2};
        System.out.println(findPeakElement(arr));
    }

    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start;
    }
}
//Leetcode medium :https://leetcode.com/problems/find-peak-element/description/

