package Algorithms.Searching.BinarySearch;

public class OrderAgnosticBS {
    //Order agnostic means you array sorted in which manners.->Ascending or Descending
    public static void main(String[] args) {
    int [] arr = {1,2,3,4};
    int target = 3;
        System.out.println(orderAgnostic(arr,target));
    }
    static int orderAgnostic(int [] arr , int target){
        int start = 0 ;
        int end = arr.length-1;
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
