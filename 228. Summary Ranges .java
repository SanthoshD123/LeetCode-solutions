import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        
        if (nums.length == 0) {
            return ranges;
        }
        
        int start = nums[0];
        int end = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                if (start == end) {
                    ranges.add(Integer.toString(start));
                } else {
                    ranges.add(start + "->" + end);
                }
                start = end = nums[i];
            }
        }
        
        if (start == end) {
            ranges.add(Integer.toString(start));
        } else {
            ranges.add(start + "->" + end);
        }
        
        return ranges;
    }
}
