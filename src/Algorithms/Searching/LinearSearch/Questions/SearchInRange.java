package Algorithms.Searching.LinearSearch.Questions;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 8};
        int start = 1;
        int end = 4;
        int target = 1;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}