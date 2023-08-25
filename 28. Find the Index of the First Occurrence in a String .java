class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int hayLength = haystack.length();
        int needleLength = needle.length();

        if (hayLength < needleLength) {
            return -1;
        }

        for (int i = 0; i <= hayLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
