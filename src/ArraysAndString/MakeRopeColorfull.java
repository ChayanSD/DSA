package ArraysAndString;

public class MakeRopeColorfull {
    public static void main(String[] args) {
        String colors = "abaac";
        int[] neededTime = {1,2,3,4,5};
        System.out.println(minCost(colors, neededTime));

    }
    public static int minCost(String colors, int[] neededTime) {
        int result = 0;
        int left = 0;
        for (int i = 1; i<colors.length();i++){
            if (colors.charAt(i) == colors.charAt(left)){
               if (neededTime[i] > neededTime[left]) {
                   result += neededTime[left];
                   left = i;
               }else {
                   result += neededTime[i];
               }
            }else {
                left = i;
            }
        }
        return result;
    }
}
//leetcode 1758