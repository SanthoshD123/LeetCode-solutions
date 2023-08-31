class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanString.append(Character.toLowerCase(c));
            }
        }
        
        // Check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanString.length() - 1;
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
