class Solution {
    public int lengthOfLastWord(String s) {
        String x = s.trim();
        int len = 0;
        for(int i=x.length()-1;i>=0;i--){
            if(x.charAt(i)==' '){
                break;
            }
            len++;
        }
        return len;
    }
}
