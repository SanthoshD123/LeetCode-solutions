class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        
        // Check if there is only one set bit and it's at an even index
        // (i.e., there are zero or more zeros between the '1' bit)
        return (n & (n - 1)) == 0 && (n & 0x55555555) == n;
    }
}
