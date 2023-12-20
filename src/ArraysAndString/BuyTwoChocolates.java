package ArraysAndString;

import java.util.Arrays;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int money = 62;
        int[] prices = {98,54,6,34,66,63,52,39};
//        int [] prices = {3,2,3};
        System.out.println(buyChoco(prices, money));
    }
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int result = (prices[0]+prices[1]);
        if (result == money){
            return 0;
        }
      if (money -result>0){
          return Math.abs(result - money);
      }else {
          return money;
      }
    }
}
