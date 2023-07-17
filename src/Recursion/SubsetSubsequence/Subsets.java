package Recursion.SubsetSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();//This is my main list that contains many lists.
        outer.add(new ArrayList<>());//Initially it will take an empty arraylist.

        //for every number in my array
        for(int num : arr){
            //take a size of my outer list.
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));//This is my internal list that create every time.
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    //T.C = O(N * 2^N)
    //Space = Same.
    //LeetCode medium : https://leetcode.com/problems/subsets/description/?source=submission-ac
}
