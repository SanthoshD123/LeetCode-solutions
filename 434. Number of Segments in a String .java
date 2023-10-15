class Solution {
    public int countSegments(String s) {
        String[] segments = s.split("\\s+");
        int count = 0;
        
        for (String segment : segments) {
            if (!segment.isEmpty()) {
                count++;
            }
        }
        
        return count;
    }
}
