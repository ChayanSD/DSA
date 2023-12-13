package ArraysAndString;

public class SpecialMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}
        };
        System.out.println(numSpecial(mat));
    }

    public static int numSpecial(int[][] mat) {
        int special = 0;

        for (int[] row : mat) {
            if (getRowSum(row) == 1) {
                int colIdx = getIndexOfOne(row);
                special += (getColumnSum(mat, colIdx) == 1) ? 1 : 0;
            }
        }

        return special;
    }

    private static int getRowSum(int[] row) {
        int sum = 0;
        for (int num : row) {
            sum += num;
        }
        return sum;
    }

    private static int getColumnSum(int[][] mat, int colIdx) {
        int sum = 0;
        for (int[] row : mat) {
            sum += row[colIdx];
        }
        return sum;
    }

    private static int getIndexOfOne(int[] row) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                return i;
            }
        }
        return -1; // If 1 is not found, return -1 or handle accordingly
    }
}