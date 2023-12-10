package ArraysAndString;

import java.util.HashMap;

public class CheckDouble {
    public static void main(String[] args) {
        int [] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        //check if the array is empty
        if (arr.length == 0){
            return false;
        }
        //loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] * 2) || (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2))){
                return true;
            }
            map.put(arr[i],i);
        }


        return false;
    }
}
//Leetcode : 1346. Check If N and Its Double Exist