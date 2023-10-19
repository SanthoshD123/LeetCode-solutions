class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int digitSum = 0;

            // Extract the digits and add them to the sum
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }

            // Update num with the sum of digits
            num = digitSum;
        }

        return num;
    }
}
