package Recursion.Level_1_Questions;

public class PrintOneToN {
    public static void main(String[] args) {
        print(6);
    }
    static void print(int n){
        if(n==0){
           //This is my base condition.
            return;
        }
        //For printing both
//        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}
//This question means when you are emptying the stack then only print.Like line number 13.