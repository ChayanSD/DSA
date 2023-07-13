package Recursion.Level_1_Questions;

public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(sum(123));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
//(n%10) gives me the last digit
//Then sum(n/10) remove the last digit
/*
3 + 12
2 + 1
2+1 = 3 so sum(12) store answer 3
then 3 + 3 = 6 that is my original answer.
 */