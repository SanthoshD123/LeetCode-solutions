class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum number of candies among the kids.
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // Initialize a List to store the result.
        List<Boolean> result = new ArrayList<>();

        // Check each kid to see if they can have the most candies.
        for (int kidCandies : candies) {
            result.add(kidCandies + extraCandies >= maxCandies);
        }

        return result;
    }
}
