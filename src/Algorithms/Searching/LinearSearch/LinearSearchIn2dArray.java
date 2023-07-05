package Algorithms.Searching.LinearSearch;

import java.util.Arrays;

public class LinearSearchIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {
                {11,23,44,78},
                {21,33,44,88,99},
                {22,46,55,788,999},
                {1,2,4,6,7,8},
        };
        int target = 788;
        int [] ans = search2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }

     static int[] search2D(int[][] arr, int target) {
        for(int row = 0 ; row < arr.length; row++){
            for(int col = 0 ; col < arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row,col}; //This is the format for returning array.
                }
            }
        }
        return new int[]{-1,-1};
    }
}
