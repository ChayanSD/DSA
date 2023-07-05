package Algorithms.Searching.BinarySearch.Questions;

public class FloorOfANumber {
    public static void main(String[] args) {
    int [] arr = {1,2,3,6,7,8};
    int target = 4;
        System.out.println(floor(arr,target));
    }
    //floor means greatest number that is smaller or equal to the target.
    static int floor(int [] arr , int target){
        int start = 0 ;
        int end = arr.length-1;
        while (start <= end){
            //finding the mid
            int mid = start + (end-start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else {
                return mid;
            }
        }
        return end;
    }

}
