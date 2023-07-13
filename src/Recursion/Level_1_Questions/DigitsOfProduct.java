package Recursion.Level_1_Questions;

public class DigitsOfProduct {
    public static void main(String[] args) {
        System.out.println(product(123));
    }
    static int product(int n){
        if(n%10 == n){ //if one digit is remaining return that digit
            return n;
        }
        return (n%10) * product(n/10);
    }
}
//(n%10) gives me the last digit
//Then sum(n/10) remove the last digit
/*
3 * product(12)
2 * product(1)
2*1 = 2 so product(12) store answer 2
then 3 * 2 = 6 that is my original answer.
 */