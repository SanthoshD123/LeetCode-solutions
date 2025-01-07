class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)
        i = 0
        for j in range(n):
            if nums[j] > 0:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1
        for j in range(i):
            val = abs(nums[j])
            if val <= i and nums[val - 1] > 0:
                nums[val - 1] = -nums[val - 1]
        for j in range(i):
            if nums[j] > 0:
                return j + 1
        return i + 1
