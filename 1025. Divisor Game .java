public class Solution {
    public boolean divisorGame(int n) {
        // Initialize an array to store the winning status for each number from 1 to n
        boolean[] dp = new boolean[n + 1];
        
        // Base case: 0 and 1 are not winning positions
        dp[0] = dp[1] = false;
        
        // Iterate through the numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            // Check if there is any divisor x such that (i - x) is a losing position
            for (int x = 1; x < i; x++) {
                if (i % x == 0 && !dp[i - x]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        // The final result is the winning status for the given number n
        return dp[n];
    }
}
