package ArraysAndString;

import java.util.*;

public class DestinationCity {
    public static void main(String[] args) {
      List<List<String>> paths = new ArrayList<>();
      paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));
        System.out.println(destCity(paths));
    }
    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for(List<String> path : paths) {
            set.add(path.get(0));
        }
        for(List<String> path : paths) {
            if(!set.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}
// Time: O(N)
// Space: O(N)
//Leetcode 1436. Destination City