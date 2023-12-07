package ArraysAndString;

public class LargestOddString {
    public static void main(String[] args) {
        String num = "35427";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        int i = num.length() - 1;
        while (i >= 0) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
            i--;
        }
        return "";
    }


}
