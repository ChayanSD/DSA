package Algorithms.Sorting.CycleSortQuestions;
import java.util.*;

public class FindAllNumbersDisappeared {
    public static void main(String[] args) {
    int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index +1){
                ans.add(index +1);
            }

        }
        return ans;
    }
   static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
