class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false; // Negative numbers are not perfect squares
        }

        long left = 1;
        long right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true; // Found a perfect square
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false; // No perfect square found
    }
}
