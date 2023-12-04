package ArraysAndString;

public class SameDigitInString {
    public static void main(String[] args) {
        String digit = "6777133339";
        System.out.println(largestGoodInteger(digit));
    }
    public static String largestGoodInteger(String num) {
        String ans = "";
        for(int i = 2; i < num.length(); i++)
            if(num.charAt(i) == num.charAt(i-1) && num.charAt(i-1) == num.charAt(i-2)) {
                if (num.substring(i - 2, i + 1).compareTo(ans) > 0)
                    ans = num.substring(i - 2, i + 1);
            }
        return ans;


    }
}
