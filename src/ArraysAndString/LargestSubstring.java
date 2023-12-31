package ArraysAndString;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LargestSubstring {
    public static void main(String[] args) {
        String s = "aa";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> ht = new HashMap<>();
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            if (ht.containsKey(s.charAt(i))) {
                max = Math.max(max, i - ht.get(s.charAt(i)) - 1);
            } else {
                ht.put(s.charAt(i), i);
            }
        }
        return max;
    }
}
// Time complexity: O(n)