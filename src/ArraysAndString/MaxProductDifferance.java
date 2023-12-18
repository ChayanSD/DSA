package ArraysAndString;

import java.util.Arrays;

public class MaxProductDifferance {
    public static void main(String[] args) {
int[] nums = {4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(nums));
        System.out.println(maxDiff(nums));
    }
    public  static int maxProductDifference(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        //find first max and second max
        for (int max : nums){
            if (max > firstMax){
                secondMax = firstMax;
                firstMax = max;
        }else if (max > secondMax){
                secondMax = max;
            }
        }

        //find first min and second min
        for (int min : nums){
            if (min < firstMin){
                secondMin = firstMin;
                firstMin = min;
            }else if (min < secondMin){
                secondMin = min;
            }
        }

        return (firstMax * secondMax) - (firstMin * secondMin);
    }

    //Leetcode: 1913. Maximum Product Difference Between Two Pairs

    //This is not a good solution
    //Time complexity: O(nlogn)
    public static int maxDiff(int [] nums){
        Arrays.sort(nums);
        int a = nums[nums.length - 1];
        int b = nums[nums.length - 2];
        int c = nums[0];
        int d = nums[1];

        return (a * b) - (c * d);
    }
}
