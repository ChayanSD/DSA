package ArraysAndString;

import java.util.HashSet;
import java.util.Set;

public class AlternativeBinaryString {
    public static void main(String[] args) {
        String s = "0100";
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        int a = 0;
        int b = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                if (ch[i] == '1') {
                    a++;
                } else {
                    b++;
                }
            } else {
                if (ch[i] == '0') {
                    a++;
                } else {
                    b++;
                }
            }
        }
        return Math.min(a, b);
    }
}

//LeetCode 1758. Minimum Changes To Make Alternating Binary String
