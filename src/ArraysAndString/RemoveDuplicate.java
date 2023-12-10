package ArraysAndString;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums [] = {1,1,2};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
    public static int removeDuplicates(int [] nums){
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}
