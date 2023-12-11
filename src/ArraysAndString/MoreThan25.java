package ArraysAndString;

import java.util.HashMap;
import java.util.Map;

public class MoreThan25 {
    public static void main(String[] args) {
        int [] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
//        findSpecialInteger(arr);
        System.out.println(findSpecialIntegerOptimized(arr));
    }
    public static int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        if (arr.length == 1) return arr[0];

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int moreThan25 = arr.length / 4;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > moreThan25) {
                return entry.getKey();
            }
        }
    return -1;
    }

    public static int findSpecialIntegerOptimized(int[] arr){
        int len = arr.length;
        int moreThan25 = len / 4;
        int count = 1;
        int initial = arr[0];

        for (int i = 1; i <len ; i++) {
            if ( initial == arr[i]) count++;
            else count = 1;

            if (count > moreThan25) return arr[i];

            initial = arr[i];
        }
    return initial;

        //Optimized Answer
    }
}
