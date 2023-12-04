package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums,0,result);
        return  result;
    }

    private static void permuteHelper(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            // Add the current permutation to the result
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }

        for (int i = start; i < nums.length; i++) {

            swap(nums,start,i);

            permuteHelper(nums,start+1,result);
            swap(nums,start,i);
        }
    }

  private static void swap(int [] nums , int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
