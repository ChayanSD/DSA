package ArraysAndString;

public class MaximumProduct {
    public static void main(String[] args) {
        int [] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                secondMax = max;
                max = nums[i];
            }else if (nums[i] >secondMax){
                secondMax = nums[i];
            }
        }
        return (max - 1) * (secondMax - 1);
    }
}
