package Algorithms.Searching.LinearSearch.Questions;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,2,3},
                {1,2,6}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        //Accounts = row
        //Persons = col
        for(int person = 0 ; person<accounts.length;person++){
            //when you start a new col just take their sum
            int sum = 0 ;
            for(int accoun=0 ; accoun<accounts[person].length;accoun++){
                sum = sum + accounts[person][accoun];
            }
            if(sum > ans){
                ans = sum;
            }
        }
       return ans;
    }
}
//Leetcode : https://leetcode.com/problems/richest-customer-wealth/description/
