package Model;

public class DynamicProgrammingSolution extends Solution{
    @Override
    public int runSolution(int[] input) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Input cannot be null or empty!");
        }
        int len = input.length;
        int[] dp = new int[len];
        int res = 0;

        for (int i = 0; i < len; i++) {
            dp[i] = 1;
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (input[j] < input[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = Math.max(dp[i], max + 1);
            res = Math.max(res, dp[i]);
        }
        return dp[len - 1];
    }
}
