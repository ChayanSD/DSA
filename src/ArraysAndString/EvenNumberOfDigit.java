package ArraysAndString;

public class EvenNumberOfDigit {
    public static void main(String[] args) {
        int [] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int evenDigit = 0;
        if (nums.length==0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length()%2==0){
                evenDigit++;
            }
        }
        return evenDigit;
    }
}
