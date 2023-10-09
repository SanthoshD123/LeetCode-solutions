class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            // Extract the current bits (or assume 0 if one string is shorter)
            int bitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int bitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;

            // Calculate the sum and carry
            int currentSum = bitA + bitB + carry;
            carry = currentSum / 2;

            // Append the result
            result.insert(0, currentSum % 2);

            // Move to the next bits
            i--;
            j--;
        }

        return result.toString();
    }
}
