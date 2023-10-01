class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCount = new int[26]; // Assuming lowercase English letters only

        // Count occurrences of each letter in magazine
        for (char ch : magazine.toCharArray()) {
            letterCount[ch - 'a']++;
        }

        // Check if there are enough occurrences of each letter for the ransom note
        for (char ch : ransomNote.toCharArray()) {
            if (letterCount[ch - 'a'] == 0) {
                return false; // Not enough occurrences of the letter in magazine
            }
            letterCount[ch - 'a']--;
        }

        return true; // All letters in the ransom note can be constructed
    }
}
