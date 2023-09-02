class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move to the next character in s
            }
            j++; // Always move to the next character in t
        }
        
        // If we reached the end of s, then s is a subsequence of t
        return i == s.length();
    }
}
