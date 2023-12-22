package ArraysAndString;

public class SplitingAString {
    public static void main(String[] args) {
        String s = "00111";
        System.out.println(maxScore(s));
    }
    public static int maxScore(String s) {
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j)=='0') left++;
            }
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j)=='1') right++;
            }
            if (left+right > max) {
                max = left + right;
            }
        }
        return max;
    }
}
