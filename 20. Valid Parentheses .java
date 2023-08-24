class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                S.push(c);
            }
            else{
                if(S.isEmpty()==true) return false;
                else if(matching(S.peek(),c)==false){
                    return false;
                }
                else S.pop();
            }
        }
        return (S.isEmpty()==true);
    }
    public static boolean matching(char a,char b){
        return((a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']'));
    }
}
