package HashMap.Questions;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(firstUniqChar(str));
    }

    public static int firstUniqChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            //check if particular character ch  is already present on my map on not
//            if (map.containsKey(ch)) {
//                map.put(ch, map.get(ch) + 1);
//            } else {
//                map.put(ch, 1);
//            }
            //Same but simple.
            int count = map.getOrDefault(ch,0);
            map.put(ch,count+1);
        }
        int index = 0;
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
               return index;
            } else {
                index++;
            }
        }
        return -1;
    }
}