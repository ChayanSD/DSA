package Recursion.ArrayQuestionRecursion;

public class RotateBS {
    public static void main(String[] args) {
    int [] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,9,0,arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {  //search in first half
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }//Search in second half.

        return search(arr, target, s, m-1);//third case.
    }
}
