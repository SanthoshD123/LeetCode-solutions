class Solution {
    public int maximumProduct(int[] nums) {
        // Sort the input array in ascending order.
        Arrays.sort(nums);

        // There are two possible cases:
        // 1. The maximum product is the product of the three largest elements.
        // 2. The maximum product is the product of the two smallest elements and the largest element
        // (in case there are negative numbers in the input).

        int n = nums.length;
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int option2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(option1, option2);
    }
}
