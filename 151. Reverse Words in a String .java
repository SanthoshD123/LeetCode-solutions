public class Solution {
    public String reverseWords(String s) {
        // Split the input string into words using space as the delimiter
        String[] words = s.split("\\s+");
        
        // Create a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();
        
        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                if (reversed.length() > 0) {
                    reversed.append(" "); // Add a space between words
                }
                reversed.append(words[i]);
            }
        }
        
        return reversed.toString();
    }
}
