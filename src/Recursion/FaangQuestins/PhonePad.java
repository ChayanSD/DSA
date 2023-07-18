package Recursion.FaangQuestins;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
//        phonePad("","7");
//        System.out.println(phonePad2("","7"));
        System.out.println(letterCombinations("23"));
    }
    static void phonePad(String p , String up){ //This is for simple printing.
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) -'0';//It will convert char to int
        int i=(digit - 2) * 3;
        if( digit > 7) i+=1;
        int len=i + 3;
        if( digit == 7 || digit == 9)
        {
            len+=1;//Cause 7 and 9 have 4 character.
        }
        while (i< len) {
            char ch= (char) ('a' + i);
            phonePad(p+ch , up.substring(1));
            i++;
        }
    }

    static List<String> letterCombinations(String digits)
    {
        ArrayList<String> list=new ArrayList<>();
        if(digits.isEmpty()) return list;

        return phonePad2("",digits);
    }
    static List<String> phonePad2(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) -'0';//It will convert char to int
        ArrayList<String> ans = new ArrayList<>();
        int i=(digit - 2) * 3;
        if( digit > 7) i+=1;
        int len=i + 3;
        if( digit == 7 || digit == 9) {
            len += 1;//7 & 9 have 4 character
        }
        while (i< len) {
            char ch= (char) ('a' + i);
            ans.addAll(phonePad2(p+ch , up.substring(1)));
            i++;
        }
        return ans;
    }
}
