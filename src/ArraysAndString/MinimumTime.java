package Arrays;

public class MinimumTime {
    public static void main(String[] args) {
        int[][] points = {
                {1, 1},
                {3, 4},
                {-1, 0}
        };
        System.out.println(minTimeToVisitAllPoints(points));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            time += toTime(points[i - 1], points[i]);
        }
//points[i-1] ->from,points[i]->to

        return time;
    }

    private static int toTime(int[] from, int[] to) {
        int xDifference = Math.abs(from[0]-to[0]);
        int yDifference = Math.abs(from[1]-to[1]);
        return Math.max(xDifference,yDifference);
    }
}
