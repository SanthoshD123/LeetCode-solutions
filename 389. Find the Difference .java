class Solution {
    public char findTheDifference(String s, String t) {
        // Initialize an array to store character counts
        int[] charCount = new int[26];
        
        // Count characters in string s and decrement their counts
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']--;
        }
        
        // Count characters in string t and increment their counts
        for (char ch : t.toCharArray()) {
            charCount[ch - 'a']++;
        }
        
        // Find the character with a positive count (it's the added letter)
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > 0) {
                return (char) (i + 'a');
            }
        }
        
        return ' '; // Return a default value (it should not reach here in a valid scenario)
    }
}
