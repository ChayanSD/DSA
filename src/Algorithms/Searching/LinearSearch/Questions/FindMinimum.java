package Algorithms.Searching.LinearSearch.Questions;

public class FindMinimum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,77,78};
        System.out.println(minimum(arr));
    }

    //Let's assume array is not empty.
     static int minimum(int[] arr) {
        int ans = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if(arr[i] < ans){
                 //update the answer.
                 ans = arr[i];
             }
         }
         return ans;
    }
}
