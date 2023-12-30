package ArraysAndString;

public class MakeAllStringEqual {
    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
    public static boolean makeEqual(String[] words) {
        int[] count = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
        }
        for (int i : count) {
            if (i % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}

//Leetcode 1897 https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/