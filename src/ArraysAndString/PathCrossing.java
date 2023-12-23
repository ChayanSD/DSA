package ArraysAndString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public static void main(String[] args) {
        String path = "NNSWWEWSSESSWENNW";
        System.out.println(isPathCrossing(path));
    }

    public static boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0;
        int y = 0;
        visited.add(x + "," + y);
        for (char ch : path.toCharArray()) {
            if (ch == 'N') y++;
            else if (ch == 'S') y--;
            else if (ch == 'E') x++;
            else if (ch == 'W') x--;
            String str = x + "," + y;
            System.out.println(str);
            if (visited.contains(str)) {
                return true;
            }
            visited.add(str);
        }
        return false;
    }
}
//1496. Path Crossing