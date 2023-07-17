package Recursion.SubsetSubsequence;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
    String str = "abc";
    subsequence("",str);
        System.out.println();
        System.out.println(subsequenceAL("",str));
    }
    static void subsequence(String p , String up){
        if(up.isEmpty()){
            System.out.print("["+p+"]");
            return;
        }
        //Taking the first character
        char ch = up.charAt(0);
        //Now i have 2 choice either take it or ignore it.
        subsequence(p+ch , up.substring(1)); //Here , take
        subsequence(p,up.substring(1));//Here, ignore
    }

    //Here return in arraylist form

    static ArrayList<String> subsequenceAL(String p , String up){
        if(up.isEmpty()){
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subsequenceAL(p+ch , up.substring(1)); //Here , take
        ArrayList<String> right= subsequenceAL(p,up.substring(1));//Here, ignore
        left.addAll(right);
        return left; //or right
    }
}
//Subsequence : Non-adjacent collection.Subsequence apply for string.
//str = abc answer = a,b,c,ab,ab,bc,abc,[]

