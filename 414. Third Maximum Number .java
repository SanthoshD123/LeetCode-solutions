class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null;

        for (Integer num : nums) {
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if ((second == null || num > second) && !num.equals(first)) {
                third = second;
                second = num;
            } else if ((third == null || num > third) && !num.equals(first) && !num.equals(second)) {
                third = num;
            }
        }

        return third != null ? third : first;
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.add(num)) {
                maxHeap.offer(num);
            }
        }

        int thirdMax = 0;
        int count = 0;

        while (!maxHeap.isEmpty() && count < 3) {
            thirdMax = maxHeap.poll();
            count++;
        }

        return count == 3 ? thirdMax : maxHeap.peek();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 1};
        System.out.println(solution.thirdMax(nums1));  // Output: 1

        int[] nums2 = {1, 2};
        System.out.println(solution.thirdMax(nums2));  // Output: 2

        int[] nums3 = {2, 2, 3, 1};
        System.out.println(solution.thirdMax(nums3));  // Output: 1
    }
}
