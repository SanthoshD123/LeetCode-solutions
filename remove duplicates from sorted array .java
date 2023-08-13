lass Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int k=0;
        for(int num : nums){
            if(h.add(num)){
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}
