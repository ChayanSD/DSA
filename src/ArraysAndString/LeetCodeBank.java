package ArraysAndString;

public class LeetCodeBank {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(totalMoney(n));
    }
    public static int totalMoney(int n) {
        int start = 1;
        int total = 0;
        int week = 0;
        while (n > 0) {
            if (week == 7) {
                week = 0;
                start = start - 6;
            }
            total += start;
            start++;
            week++;
            n--;
        }
        return total;
    }
}
