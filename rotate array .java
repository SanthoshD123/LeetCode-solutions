class Solution {
    public void rotate(int[] nums, int k,int start ,int end) {
        for(int i=0;i<k;i++){
            int lastElement = nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0] = lastElement;
        }
    }
} //for easy understading and online test ,you can use this
--------------------------------------------------------------------------------------------------------------------------------------------
  class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is larger than n
        
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
} 
