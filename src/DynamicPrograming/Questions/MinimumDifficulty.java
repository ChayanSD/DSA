package DynamicPrograming.Questions;

public class MinimumDifficulty {
    public static void main(String[] args) {
        int jobDifficulty[] = {6,5,4,3,2,1};
        int d = 2;
        System.out.println(minDifficulty(jobDifficulty, d));
    }
    public static int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if(n < d) return -1;
        int dp[][] = new int[d][n];
        dp[0][0] = jobDifficulty[0];
        for(int i = 1; i < n; i++) {
            dp[0][i] = Math.max(jobDifficulty[i], dp[0][i-1]);
        }
        for(int i = 1; i < d; i++) {
            for(int j = i; j < n; j++) {
                int max = jobDifficulty[j];
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = j; k >= i; k--) {
                    max = Math.max(max, jobDifficulty[k]);
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][k-1] + max);
                }
            }
        }
        return dp[d-1][n-1];
    }
}
