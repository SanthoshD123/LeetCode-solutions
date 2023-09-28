class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuilder merge = new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
            merge.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            merge.append(word2.charAt(j));
            j++;
        }
        return merge.toString();
    }
}
