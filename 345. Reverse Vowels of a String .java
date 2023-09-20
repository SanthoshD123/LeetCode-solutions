class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move the left pointer to the right until a vowel is found
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            
            // Move the right pointer to the left until a vowel is found
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            
            // Swap the vowels at left and right
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(chars);
    }
    
    // Helper method to check if a character is a vowel (both lower and upper case)
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
