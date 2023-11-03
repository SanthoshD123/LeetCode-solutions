public class Solution {
    public boolean isPowerOfThree(int n) {
        // Handle special cases
        if (n <= 0) {
            return false;
        }

        // Find the maximum power of 3 within the range of 32-bit signed integer
        int maxPowerOfThree = (int) Math.pow(3, 19); // 3^19 is the largest power of 3 within the 32-bit integer range

        // Check if n is divisible by the maximum power of three
        return maxPowerOfThree % n == 0;
    }
}
