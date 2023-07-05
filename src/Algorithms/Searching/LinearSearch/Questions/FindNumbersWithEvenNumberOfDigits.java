package Algorithms.Searching.LinearSearch.Questions;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int [] nums = {1,2,222,22};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
    int count = 0 ;
    for(int num : nums){
        if(even(num)){
            count++;
        }
    }
    return count;
    }
    static boolean even(int num){
        /*
          if(countOfDigits(num) % 2 == 0){
           return true;
       }
         */
        return countOfDigits(num) % 2 == 0;
    }
    static int countOfDigits(int num){
        if(num < 0){
            num = num * -1;
        }
//        if(num==0){
//            return 1;
//        }
//    int count = 0 ;
//    while(num > 0){
//        count++;
//        num /=10;
//    }
//    return count;
        return (int) (Math.log10(num)) +1; //This is the shortcut to find how many digits has any num.
    }
}
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
