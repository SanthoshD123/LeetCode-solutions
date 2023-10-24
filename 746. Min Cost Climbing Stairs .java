public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        // Create an array to store the minimum cost to reach each step
        int[] dp = new int[n];
        
        // The minimum cost to reach the first and second steps is the cost itself
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for (int i = 2; i < n; i++) {
            // The minimum cost to reach step i is the cost at step i plus the minimum
            // of the cost to reach step i-1 and step i-2
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        
        // The minimum cost to reach the top is the minimum of the cost to reach the
        // last step and the step before the last step
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
