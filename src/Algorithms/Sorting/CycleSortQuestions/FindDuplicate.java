package Algorithms.Sorting.CycleSortQuestions;

public class FindDuplicate {
    public static void main(String[] args) {
    int [] arr = {1,2,2,3};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if (arr[i] != i+1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                }
                else {
                    return arr[i];
                }
            }
            else {
                i++;
            }

        }
        return -1;
    }
    static   void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
//LeetCode:https://leetcode.com/problems/find-the-duplicate-number/description/