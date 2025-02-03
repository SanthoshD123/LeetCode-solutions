class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l_multiply = 1
        r_multiply = 1
        n = len(nums)
        l_arr = [0]*n
        r_arr = [0]*n

        for i in range(n):
            j = -i-1
            l_arr[i] = l_multiply
            r_arr[j] = r_multiply
            l_multiply *= nums[i]
            r_multiply *= nums[j]

        return [l*r for l,r in zip(l_arr,r_arr)]
