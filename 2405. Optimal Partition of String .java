import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int partitionString(String s) {
        Set<Character> seen = new HashSet<>(); // To keep track of characters seen in the current substring
        int partitions = 0; // Initialize the number of partitions
        
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                partitions++;
                seen.clear(); // Start a new substring
            }
            
            seen.add(c);
        }
        
        // If there are any remaining characters in the last substring
        if (!seen.isEmpty()) {
            partitions++;
        }
        
        return partitions;
    }

    // Example usage:
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "abacaba";
        String s2 = "ssssss";

        System.out.println(solution.partitionString(s1)); // Output: 4
        System.out.println(solution.partitionString(s2)); // Output: 6
    }
}
