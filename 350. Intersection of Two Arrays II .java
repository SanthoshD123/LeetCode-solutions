public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> count1 = new HashMap<>();
        Map<Integer, Integer> count2 = new HashMap<>();

        // Count the occurrences of each element in both arrays
        for (int num : nums1) {
            count1.put(num, count1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            count2.put(num, count2.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();

        // Iterate through the elements in one of the arrays
        for (int num : count1.keySet()) {
            if (count2.containsKey(num)) {
                // Add the element as many times as it appears in both arrays
                int commonCount = Math.min(count1.get(num), count2.get(num));
                for (int i = 0; i < commonCount; i++) {
                    resultList.add(num);
                }
            }
        }

        // Convert the result list to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
