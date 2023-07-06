package Algorithms.Searching.BinarySearch.Questions;

public class FindInMountainArray {
    //https://leetcode.com/problems/find-in-mountain-array/
    public static void main(String[] args) {
      int[]  arr = {0,1,2,4,2,1};
      int target = 2;
        System.out.println(search(arr,target));
    }
    static int search(int [] arr , int target ){
        int peak = peak(arr);
        int firstTry = orderAgnostic(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr,target,peak+1,arr.length-1);
    }
    //this fun will give me the peak value.
    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
       return start;
    }
    static int orderAgnostic(int [] arr , int target,int start,int end){
        boolean isAscending = arr[start] <arr[end];
        while (start <= end){
            //finding the mid
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAscending){
                if (target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }else {
                if (target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }

        }
        return -1;
    }
}
