package ArraysAndString;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] result = sortedSquares(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int [] result = new int[nums.length];
        int square;
        for (int i = 0; i < nums.length; i++) {
            square = nums[i]*nums[i];
            result[i] = square;
        }
        Arrays.sort(result);
       return result ;
    }
}
