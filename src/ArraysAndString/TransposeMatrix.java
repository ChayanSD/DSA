package ArraysAndString;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int result [][] = transpose(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int result [][] = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r ; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}

//Question: https://leetcode.com/problems/transpose-matrix/
//LeetCode : 867