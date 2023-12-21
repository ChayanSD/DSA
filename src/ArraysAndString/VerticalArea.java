package ArraysAndString;

import java.util.Arrays;

public class VerticalArea {
    public static void main(String[] args) {
        int [][] points = {
                {8,7},
                {9,9},
                {7,4},
                {9,7}
        };
        int res = maxWidthOfVerticalArea(points);
        System.out.println(res);
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
        int res = 0;
        Arrays.sort(points, (a,b) -> a[0] - b[0]);
        for (int i = 0; i < points.length -1; i++) {
            res= Math.max(res, points[i+1][0] - points[i][0]);
        }
        return res;
    }
}
