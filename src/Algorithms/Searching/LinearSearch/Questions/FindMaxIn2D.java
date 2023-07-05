package Algorithms.Searching.LinearSearch.Questions;

import java.util.Arrays;

public class FindMaxIn2D {
    public static void main(String[] args) {
        int [][] arr = {
                {11,23,44,78},
                {21,33,44,88,99},
                {22,46,55,788,999},
                {1,2,4,6,7,8},
        };
        System.out.println(maximum(arr));
    }
    static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
//        for(int row = 0 ; row < arr.length; row++){
//            for(int col = 0 ; col < arr[row].length; col++){
//                if(arr[row][col] > max){
//                    max = arr[row][col];
//                }
//            }
//        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
       return max;
    }
}
