package Recursion.Level_1_Questions;

public class PrintNtoOne {
    public static void main(String[] args) {
        print(6);
    }
    static void print(int n){
        if(n==1){
            System.out.println(1); //This is my base condition.
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
