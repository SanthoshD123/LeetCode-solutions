import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // Create a copy of the scores array and sort it in descending order
        int[] sortedScores = Arrays.copyOf(score, n);
        Arrays.sort(sortedScores);
        HashMap<Integer, String> rankMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                rankMap.put(sortedScores[i], "Gold Medal");
            } else if (i == n - 2) {
                rankMap.put(sortedScores[i], "Silver Medal");
            } else if (i == n - 3) {
                rankMap.put(sortedScores[i], "Bronze Medal");
            } else {
                rankMap.put(sortedScores[i], Integer.toString(n - i));
            }
        }

        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }

        return result;
    }
}
