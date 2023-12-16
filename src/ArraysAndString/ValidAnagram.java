package ArraysAndString;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "naagram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) return false;
      char [] arrS = s.toCharArray();
        char [] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS, arrT);
    }
}
//LeetCode: https://leetcode.com/problems/valid-anagram/
//Question No : 242