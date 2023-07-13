package Recursion.Level_1_Questions;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(isPalindrome(1221));
    }
    static int reverse(int n){
        //sometimes you might need some additional variable in the argument
        //in that case, make another function.
        //In this question idea is :
        //Take last number put them 1st then add
        //But we need base
        int digits = (int) Math.log10(n) + 1; //it will give how many digits have in n.
        return helper(n,digits);
    }
    static int helper(int n , int digits){
        //if it is one-digit number
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10 , digits-1)) + helper(n/10,digits-1);
    }

    //We can also check if the number is palindrome or not
    static boolean isPalindrome(int n){
        return n==reverse(n);
    }
}
