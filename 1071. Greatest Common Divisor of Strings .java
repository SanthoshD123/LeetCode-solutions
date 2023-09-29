class Solution {
    public String gcdOfStrings(String str1, String str2) {

        // Check if str1 + str2 is equal to str2 + str1
        if ((str1 + str2).equals(str2 + str1)) {
            // Find the greatest common divisor of lengths using Euclidean algorithm
            int lengthGcd = gcd(str1.length(), str2.length());

            // Return the common divisor substring
            return str1.substring(0, lengthGcd);
        }

        return "";
    }

    // Euclidean algorithm to find the greatest common divisor
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
