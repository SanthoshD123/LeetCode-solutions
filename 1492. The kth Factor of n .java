class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;  // Initialize the count of factors
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        
        return -1;  // If we reach here, there are fewer than k factors
    }
}
