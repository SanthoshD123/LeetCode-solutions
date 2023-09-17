class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAvg = Integer.MIN_VALUE;
        double currentAvg = 0;

        // Calculate the initial sum of the first k elements
        for (int i = 0; i < k; i++) {
            currentAvg += nums[i];
        }
        
        maxAvg = currentAvg / k; // Initialize maxAvg with the average of the first k elements

        // Use a sliding window to find the maximum average
        for (int i = k; i < n; i++) {
            currentAvg += nums[i] - nums[i - k]; // Add the next element and remove the first element in the window
            maxAvg = Math.max(maxAvg, currentAvg / k); // Update maxAvg if a higher average is found
        }

        return maxAvg;
    }
}
