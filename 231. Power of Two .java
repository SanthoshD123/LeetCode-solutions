class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;  // Powers of 2 are positive integers
        }
        return (n & (n - 1)) == 0;
    }
}
